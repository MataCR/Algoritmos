/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;

/**
 *
 * @author Mata
 */
public class LQueue<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public LQueue(){
        this.front = new Node<>();
        this.rear = this.front;
        this.size = 0;
    }

    public void enqueue(T element){
        this.rear.setNext(new Node<T>(element, null));
        this.rear = rear.getNext();
        this.size++;
    }

    public T dequeue(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        T temp = this.front.getNext().getElement();
        Node<T> nTemp = this.front.getNext();
        this.front.setNext(nTemp.getNext());
        if (this.rear == nTemp){
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }

    public Object first(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        return this.front.getNext().getElement();
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        this.front = new Node<>();
        this.rear = this.front;
        this.size = 0;
    }

    public String toString(){
        String result = "**LQueue**\n";
        Node<T> tFront = this.front;
        int tSize = this.size;
        while(tSize != 0){
            result+= tFront.getNext().getElement() + " ";
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }

    public void rotate(){
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            Node<T> current = this.front.getNext();
            Node<T> temp = null;
            Node<T> newRear = null;
            while (current != null) {
                if (current == this.front.getNext()){
                    temp = new Node<T>(current.getElement(), null);
                    newRear = temp;
                } else if (current == this.rear) {
                    temp = new Node<T>(current.getElement(), temp);
                    this.front.setNext(temp);
                } else {
                    temp = new Node<T>(current.getElement(), temp);
                }
                current = current.getNext();
            }
            this.rear = newRear;
        }
    }

    public void rotate2(){
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            Node<T> next = this.front.getNext();
            Node<T> afterNext = next.getNext();
            Node<T> temp = null;

            while (afterNext != null) {
                if (next == this.front.getNext()){
                    next.setNext(null);
                    this.front.setNext(this.rear);
                    this.rear = next;
                }
                temp =  afterNext.getNext();
                afterNext.setNext(next);
                next = afterNext;
                afterNext = temp;
            }

        }
    }

    public static void main(String[] args) {
        LQueue<Integer> colaEnteros = new LQueue<>();
        colaEnteros.enqueue(1);
        colaEnteros.enqueue(2);
        colaEnteros.enqueue(3);
        colaEnteros.enqueue(4);
        colaEnteros.enqueue(5);
        System.out.println(colaEnteros.toString());
        colaEnteros.dequeue();
        colaEnteros.dequeue();
        colaEnteros.enqueue(6);
        colaEnteros.enqueue(7);
        colaEnteros.enqueue(8);
        System.out.println(colaEnteros.toString());
        System.out.println("Front: " + colaEnteros.first());
        colaEnteros.rotate();
        System.out.println("After rotate: " + colaEnteros.toString());
        colaEnteros.rotate2();
        System.out.println("After rotate2: " + colaEnteros.toString());
    }

}
