/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.estructuras;

/**
 *
 * @author jearo
 * @param <X>
 */
public class LinkedNode<X> {
    private X element;
    private LinkedNode<X> nextNode;

    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public LinkedNode<X> getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedNode<X> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "element=" + element;
    }

    public LinkedNode(X element) {
        this.element = element;
    }
    
    
    
    
}
