package org.example.sealed.model.shapes;
/**
 * This is the sealed class. Sealed classes allows you to control which classes can extend or implement themselves.
 * @sealed - defines the sealed classes
 * @permits - defines what classes are allowed to extend/implement the class
 * */

public sealed interface Shape permits Circle, Rectangle, Triangle {
    public abstract double area();
}
