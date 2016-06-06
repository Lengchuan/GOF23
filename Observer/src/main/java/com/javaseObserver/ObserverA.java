package com.javaseObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class ObserverA implements Observer{

    private int mystate;
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    public void update(Observable o, Object arg) {
        mystate =((ConcreteSubject)o).getState();

    }

    public int getMystate() {
        return mystate;
    }

    public void setMystate(int mystate) {
        this.mystate = mystate;
    }
}
