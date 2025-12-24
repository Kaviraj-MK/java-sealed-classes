package org.example.sealed.model.shapes;

public record Rectangle(double width, double height) implements Shape  {
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid width or height");
        }
    }

    @Override
    public double area() {
        return width * height;
    }
}
