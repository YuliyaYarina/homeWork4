public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 20;
        System.out.println("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетичя, и нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = 32;
        System.out.println("На улице " + temperature + " градусов, ");
        if (temperature <= 5) {
            System.out.println("на улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("сегодня тепло можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 30;
        System.out.println("Если скорость" + speed + ", то ");
        if (speed >= 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        short age = 5;
        System.out.println("Если возраст человека равен " + age + ", то ");
        if (age >= 2 && age <= 6) {
            System.out.println("ему нужно ходить в садик");
        } else if (age >= 7 && age <= 18) {
            System.out.println("ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("ему нужно ходить в школу");
        } else if (age > 24) {
            System.out.println("то ты уже большой иди на работу");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        short age = 10;
        System.out.println("Если возраст ребенка равен " + age + ", то ему");
        if (age < 5) {
            System.out.println("нельзя кататься");
        } else if (age >= 5 && age < 14) {
            System.out.println("можно кататься только с сопровождением взрослого. если взрослого нет то кататься нельзя");
        } else if (age > 14) {
            System.out.println("можно кататься без сопровождения взрослого");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatPlace = 60;
        int place = 111;
        if (place > 0 && place <= 60) {
            System.out.println(" достанется сидячее мето");
        } else if (place > 60 && place <= 102) {
            System.out.println("достанется стоячее место");
        } else if (place > 102) {
            System.out.println("места не достанется");
        }


    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 16;
        int free = 17;
        if (one >= two) {
            if (one > free) {
                System.out.println("Максимальное число - " + one);
            } else if (free > one) {
                System.out.println("Максимальное число - " + free);
            } else {
                System.out.println("Числа " + one + " и " + free + " равны");
            }
        } else  if (two > one) {
            if (two > free) {
                System.out.println("Максимальное число - " + two);
            } else if (free > two) {
                System.out.println("Максимальное число - " + free);
            } else {
                System.out.println("Числа " + two + " и " + free + " равны");
            }
        } else {
            if (one > free) {
                System.out.println("Максимальное число - " + one);
            } else if (free > one) {
                System.out.println("Максимальное число - " + free);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}