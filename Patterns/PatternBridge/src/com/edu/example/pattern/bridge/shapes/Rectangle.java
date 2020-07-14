package com.edu.example.pattern.bridge.shapes;
import com.edu.example.pattern.bridge.interfaces.Color;

public class Rectangle extends AbstractShape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
