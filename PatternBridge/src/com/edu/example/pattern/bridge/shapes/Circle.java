package com.edu.example.pattern.bridge.shapes;
import com.edu.example.pattern.bridge.interfaces.Color;

public class Circle extends AbstractShape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
