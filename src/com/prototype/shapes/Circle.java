package com.prototype.shapes;

public class Circle extends Shape {

    private int radius;

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.setRadius(target.getRadius());
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) {
            return false;
        }
        Circle shape2 = (Circle) object2;
        return shape2.getRadius() == getRadius();
    }
}
