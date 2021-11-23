package com.geekbrines;

/*
1.  Создать классы Собака и Кот с наследованием от класса Животное.
2.  Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    Результатом выполнения действия будет печать в консоль. (Например, dogOne.run(150); -> 'Бобик пробежал 150 м.');
3.  У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4.  * Добавить подсчет созданных котов, собак и животных.
 */

public class HomeWorkSix {

    public static void main(String[] args) {

        Dog dogOne = new Dog("Барс");
        Dog dogTwo = new Dog("Мухтар");
        Dog dogThree = new Dog("Бобик");
        Cat catOne = new Cat("Арина");
        Cat catTwo = new Cat("Рыжик"); // делаю несколько собак и котов

        dogOne.swim(8);
        dogOne.run(350);
        dogTwo.swim(0);
        dogTwo.run(510);
        dogThree.swim(11);
        dogThree.run(-10); // задаю параметры собакам, розные чтобы было интересней

        System.out.println("***");
        catOne.swim(2);
        catOne.run(105);
        catTwo.swim(0);
        catTwo.run(220); // задаю параметры котов, также разные

        System.out.println("***");
        Animal.sumAnimal(); // все животные
        Dog.sumDog(); // только собаки
        Cat.sumCat(); // только коты

    }

}
