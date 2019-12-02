package com.company;

public class Circle extends Figure {
    private int r;

    public int getR() {
        return r;
    }

    public double getP() {
        return p;
    }

    private final double p = 3.14;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    public double Perimetr() {
        return 2 * p * r;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD34";
    }
}
