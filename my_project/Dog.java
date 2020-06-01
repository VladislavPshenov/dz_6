package my_project;

import my_project.Animals;

import java.util.Random;

public class Dog extends Animals
{
    Dog (float run, float swim, float jump)
    {
        super(run, swim, jump);
    }
@Override
    void toRun (float run) {
        Random rand = new Random ();
        int ran = (rand.nextInt(200) + 401);
        System.out.println("Заданное расстояние: " + run + "; Новое ограничение на расстояние забега: " + ran);
        if (run > ran) {
            System.out.println("run: false");
        } else {
            System.out.println("run: true");
        }
    }
@Override
    void toSwim (float swim) {
    Random ran = new Random();
    int a = ran.nextInt(20) + 1;
    System.out.println("Заданное расстояние: " + swim + "; Новое ограничение на расстояние заплыва: " + a);
    if (swim > a) {
        System.out.println("swim: false");
    } else {
        System.out.println("swim: true");
    }
}
@Override
    void toJump(float jump) {
        double a = (Math.random()+0.1);
        System.out.println("Заданная высота: " + jump + "; Новое ограничение на высоту прыжка: " + a);
        if (jump > a) {
            System.out.println("jump: false");
        } else {
            System.out.println("jump: true");
        }
    }
}