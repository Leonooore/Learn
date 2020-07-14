package com.edu.example.pattern.bridge;

import com.edu.example.pattern.bridge.colors.BlueColor;
import com.edu.example.pattern.bridge.interfaces.Color;
import com.edu.example.pattern.bridge.shapes.AbstractShape;
import com.edu.example.pattern.bridge.shapes.Circle;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Color blue = new BlueColor();
	    AbstractShape circle = new Circle(blue);
	    circle.draw();
        blue.fillColor();
    }
}
