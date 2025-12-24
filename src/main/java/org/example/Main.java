package org.example;

import org.example.sealed.model.shapes.Circle;
import org.example.sealed.model.shapes.Rectangle;
import org.example.sealed.model.shapes.Shape;
import org.example.sealed.model.shapes.Triangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Sealed classes.
        System.out.println("Sealed Classes Examples : shapes");
        Shape circle = new Circle(21.3);
        Shape rectangle = new Rectangle(243.2, 12.0);
        Shape triangle = new Triangle(20, 5);

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of triangle: " + triangle.area());
    }
}