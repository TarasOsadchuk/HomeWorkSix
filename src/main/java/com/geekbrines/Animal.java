package com.geekbrines;

public abstract class Animal {

    private static int numbAnimal; // переменная которая изменятся по мере добавления животных
    protected String name;

    public Animal(String name) {
        this.name = name;
        numbAnimal++; // счетчик
    }

    abstract void swim(int meters); // делаю абстрактный метод "swim"

    abstract void run(int meters); // делаю абстрактный метод "run"

    public static void sumAnimal() {
        System.out.println("Количество животных - " + numbAnimal); // вывожу суму (всех) животных
    }

}