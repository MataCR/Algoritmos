/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.estructuras;

import lotoTEC.interfaces.QueueStackBehavior;


/**
 *
 * @author jearo
 */
public class StackList<X> implements QueueStackBehavior<X> {

    LinkedNode<X> head, tail;
    int size;

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
        LinkedNode<X> newNode = new LinkedNode<>(element);
        if (isEmpty()) {
            head = new LinkedNode<>(element);
            tail = head;
            size++;
        } else {
            newNode.setNextNode(head);
            head = newNode;
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

    @Override
    public void delete(X element) {
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
