package com.learn.patterns.observerpattern;

import java.util.Observable;

public interface DisplayElements {
    public void update(Observable obs, Object arg);
}
