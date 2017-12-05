package org.patterns.decorator;

public class SpapeDecorator implements Shape {
    protected Shape decoratedShape;

    public SpapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
