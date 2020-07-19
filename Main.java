package ru.geekbrains.Lesson_6;

public class Main
        {

    public static void main(String[] args)
            {

                Cat cat = new Cat();
                cat.run(200);
                cat.jump(2);

                Dog dog = new Dog();
                dog.run(500);
                dog.swim(10);
                dog.jump(0.5);
            }
        }