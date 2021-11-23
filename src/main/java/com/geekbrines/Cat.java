package com.geekbrines;

public class Cat extends Animal {

    private static int numbCat;

    public Cat(String name) {
        super(name);
        numbCat++;
    }

    @Override
    public void swim(int meters) {
        System.out.println("Кот не умеет плавать!");
    }

    @Override
    public void run(int meters) {
        if (meters > 200) {
            System.out.println("Кот столько не пробежит.");
        } else if (meters == 0) {
            System.out.println("Кот " + name + " не двигался.");
        } else if (meters < 0) {
            System.out.println("Кот " + name + " назад не пробежит.");
        } else {
            System.out.println("Кот " + name + " пробежал " + meters + "м.");
        }
    }

    public static void sumCat() {
        System.out.println("Количество котов - " + numbCat);
    }

}
