package com.edu.example.pattern.bridge.colors;
import com.edu.example.pattern.bridge.interfaces.Color;

public class GreenColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("Filling in green color");
    }
}
