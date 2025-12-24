package org.example.sealed.model.shapes;

import java.math.BigDecimal;

public record Circle(double radius) implements Shape {
    private static final Double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Radius cannot be a minus value here");
        }
    }
    @Override
    public double area() {
        return PI*radius*radius;
    }
}
