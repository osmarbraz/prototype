package com.prototype.shapes;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.setWidth(target.getWidth());
            //A linha anterior é equivalente a
            //this.width = target.width;
            this.setHeight(target.getHeight());
            //A linha anterior é equivalente a
            //this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) {
            return false;
        }
        Rectangle shape2 = (Rectangle) object2;
        return shape2.getWidth() == getWidth() && shape2.getHeight() == getHeight();
        //A linha anterior é equivalente a
        //return shape2.width == width && shape2.height == height;
    }
}
