/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.interfaces;

/**
 *
 * @author jearo
 */
public interface QueueStackBehavior<X> extends GlobalListBehavior<X> {

    public void delete(X element);

}
