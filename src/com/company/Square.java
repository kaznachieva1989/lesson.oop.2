package com.company;

public class Square extends Figure {
    private int a;

    public int getA() {
        return a;
    }

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    public double Perimetr() {
        return 4 * a;
    }

    @Override
    public String draw() {
        return "\uD83D\uDD32";
    }
}
