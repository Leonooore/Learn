package com.edu.example.pattern.bridge.shapes;
import com.edu.example.pattern.bridge.interfaces.Color;

public class Triangle extends AbstractShape{
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}
