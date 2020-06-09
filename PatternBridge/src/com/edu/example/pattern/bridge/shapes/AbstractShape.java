package com.edu.example.pattern.bridge.shapes;
import com.edu.example.pattern.bridge.interfaces.Color;

public abstract class AbstractShape {
    protected Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
