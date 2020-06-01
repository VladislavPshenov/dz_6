package my_project;

import my_project.Animals;

import java.util.Random;

public class Cat extends Animals {

    Cat(float run, float swim, float jump)
    {
        super(run, swim, jump);
    }
@Override
    void toRun(float run) {
        Random ran = new Random ();
        int a = ran.nextInt(150) + 101;
        System.out.println("Заданное расстояние: "+ run + "; Новое ограничение на расстояние забега = " + a);
        if (run > a) {
            System.out.println("run: false");
        } else {
            System.out.println("run: true");
        }
    }
@Override
     void toSwim(float swim)
    {
            System.out.println("swim: кот не умеет плавать!");
        }
@Override
    void toJump(float jump) {
        Random ran = new Random ();
        int a = ran.nextInt(1) + 2;
        System.out.println("Заданная высота: " + jump + "; Новое ограничение на высоту прыжка: " + a);
        if (jump > a) {
            System.out.println("jump: false");
        } else {
            System.out.println("jump: true");
        }
    }
}


