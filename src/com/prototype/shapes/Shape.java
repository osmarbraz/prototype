package com.prototype.shapes;

import java.util.Objects;

public abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.setX(target.getX());
            //A linha anterior é equivalente a
            //this.x = target.x;
            this.setY(target.getY());
            //A linha anterior é equivalente a
            //this.y = target.y;
            this.setColor(target.getColor());
            //A linha anterior é equivalente a            
            //this.color = target.color;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) {
            return false;
        }
        Shape shape2 = (Shape) object2;
        return shape2.getX() == getX() && shape2.getY() == getY() && Objects.equals(shape2.getColor(), getColor());
        //A linha anterior é equivalente a
        //return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
