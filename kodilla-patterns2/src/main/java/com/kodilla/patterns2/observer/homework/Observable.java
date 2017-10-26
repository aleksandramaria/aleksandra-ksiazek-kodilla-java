package com.kodilla.patterns2.observer.homework;


/**
 * Created by ola on 26/10/2017.
 */

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
