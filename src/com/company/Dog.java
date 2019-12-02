package com.company;

public class Dog extends Animal implements SoundProducable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return "\uD83D\uDC15";
    }

    @Override
    public void callSound(String voice) {
        System.out.println(voice);
    }
}
