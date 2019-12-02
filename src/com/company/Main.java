package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Круг ", 2);
        circle.Perimetr();
        //System.out.println(circle.getName() + circle.Perimetr());
        Square square = new Square("Квадрат ", 5);
        square.Perimetr();
        //System.out.println(square.getName() + square.Perimetr());

        Figure[] figures = {circle, square, new Triangle("Треугольник ", 2, 3, 4),
                new Rectangle("Прямоугольник ", 1, 2)};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + " " + figures[i].draw() + " " + figures[i].Perimetr());
        }
        Dog dog = new Dog("Simbo ");
        System.out.print(dog.getName() + dog.draw());
        dog.callSound(" Гав-гав");
    }
}
