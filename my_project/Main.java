package my_project;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Базовые огранияения для котов. Бег: 200; Заплыв: Коты не умеют плавать; Прыжок: 2");
        Cat cat1 = new Cat (250, 10, 1.5f);
        cat1.printInfo();
        System.out.println();

        Cat cat2 = new Cat (290, 6, 0f);
        cat2.printInfo();
        System.out.println();

        Cat cat3 = new Cat (50, 200, 2.5f);
        cat3.printInfo();
        System.out.println();

        System.out.println("Базовые огранияения для собак. Бег: 500; Заплыв: 10; Прыжок: 0.5");;
        Dog dog1 = new Dog (550, 15, 0.3f);
        dog1.printInfo();
        System.out.println();

        Dog dog2 = new Dog (120, 25, 1f);
        dog2.printInfo();
        System.out.println();

        Dog dog3 = new Dog (400, 8, 0.5f);
        dog3.printInfo();
    }
}
