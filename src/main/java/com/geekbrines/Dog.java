package com.geekbrines;

public class Dog extends Animal {

    private static int numbDog;

    public Dog(String name) {
        super(name);
        numbDog++;
    }

    @Override
    public void swim(int meters) {
        if (meters > 10) {
            System.out.println("Собака столько не проплывет.");
        } else if (meters == 0) {
            System.out.println("Собака " + name + " не двигался.");
        } else if (meters < 0) {
            System.out.println("Собака " + name + " назад не плывет.");
        } else {
            System.out.println("Собака " + name + " проплыл " + meters + "м.");
        }
    }

    @Override
    public void run(int meters) {
        if (meters > 500) {
            System.out.println("Собака столько не пробежит.");
        } else if (meters == 0) {
            System.out.println("Собака " + name + " не двигался.");
        } else if (meters < 0) {
            System.out.println("Собака " + name + " назад не пробежит.");
        } else {
            System.out.println("Собака " + name + " пробежал " + meters + "м.");
        }
    }

    public static void sumDog() {
        System.out.println("Количество собак - " + numbDog);
    }

}
