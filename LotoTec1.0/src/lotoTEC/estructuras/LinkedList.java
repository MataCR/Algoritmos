/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.estructuras;

import lotoTEC.interfaces.LinkedListBehavior;

/**
 *
 * @author jearo
 */
public class LinkedList<X> implements LinkedListBehavior<X> {

    private LinkedNode<X> head;
    private LinkedNode<X> tail;
    private int size;

    public LinkedNode<X> getHead() {
        return head;
    }

    public void setHead(LinkedNode<X> head) {
        this.head = head;
    }

    public LinkedNode<X> getTail() {
        return tail;
    }

    public void setTail(LinkedNode<X> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void insert(X element) {
        if (isEmpty()) {
            head = new LinkedNode<>(element);
            tail = head;
            size++;
        } else {
            tail.setNextNode(new LinkedNode<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }

    @Override
    public X consult(X element) {
        LinkedNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(element)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    @Override
    public void update(X initialElem, X replacedElem) {
        LinkedNode<X> temp, tempPrev, tempNext, tempNew;
        temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getNextNode().equals(initialElem)) {
                tempPrev = temp;
                temp = temp.getNextNode();
                tempNext = temp.getNextNode();
                tempNew = new LinkedNode<>(replacedElem);
                tempPrev.setNextNode(tempNew);
                tempNew.setNextNode(tempNext);
                temp.setElement(null);
            } else {
                temp = temp.getNextNode();
            }
        }
    }

    private void rearDelete() {
        LinkedNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getNextNode() == tail) {
                tail = temp;
                tail.setNextNode(null);
            } else {
                temp.getNextNode();
            }
        }
        size--;
    }

    private void frontDelete() {
        LinkedNode<X> temp = head;
        head = head.getNextNode();
        temp.setNextNode(null);
        size--;
    }

    private void deleteUniqueElement(X element) {
        head = null;
        tail = head;
        size--;
    }

    private void deleteOnTowElements(X element) {
        if (head.getElement().equals(element)) {
            frontDelete();
        } else if (tail.getElement().equals(element)) {
            rearDelete();
        }
    }

    private void deleteOnMiddle(X element) {
        LinkedNode<X> tempNode, tempPrev, tempNext;
        tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.getNextNode().getElement().equals(element)) {
                tempPrev = tempNode;
                tempNode = tempNode.getNextNode();
                tempNext = tempNode.getNextNode();
                tempPrev.setNextNode(tempNext);
                tempNode.setNextNode(null);
            } else {
                tempNode = tempNode.getNextNode();
            }
        }
        size--;
    }

    @Override
    public void delete(X element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                rearDelete();
            } else if (head.getElement().equals(element)) {
                frontDelete();
            } else if (size == 1) {
                deleteUniqueElement(element);
            } else if (size == 2) {
                deleteOnTowElements(element);
            } else if (size >= 3) {
                deleteOnMiddle(element);
            }
        }
    }

    @Override
    public String toString() {
        String msg = "";
        LinkedNode<X> temp = head;
        for (int i = 0; i < size; i++) {
            msg += temp.toString();
            temp = temp.getNextNode();
        }
        return msg;
    }
}
