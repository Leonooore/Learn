package com.edu.example.pattern.bridge.colors;
import com.edu.example.pattern.bridge.interfaces.Color;

public class BlueColor implements Color {
    @Override
    public void fillColor(){
        System.out.println("Filling in blue color");
    }
}
