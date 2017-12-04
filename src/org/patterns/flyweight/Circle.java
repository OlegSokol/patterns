package org.patterns.flyweight;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Circle setColor(String color) {
        this.color = color;
        return this;
    }

    public int getX() {
        return x;
    }

    public Circle setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Circle setY(int y) {
        this.y = y;
        return this;
    }

    public int getRadius() {
        return radius;
    }

    public Circle setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
