package com.company;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Perimetr() {
        return a + b + c;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD3A";
    }
}
