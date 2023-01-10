public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        /*Вариант 1*/
        int age1 = 18;
        int age2 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " ,то он совершеннолетний");
        }
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 +
                    " ,то он несовершеннолетний, нужно немного подождать");
        }
        /*Вариант 2*/
        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " ,то он несовершеннолетний, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        /*Вариант 1*/
        int temp1 = 2;
        int temp2 = 6;
        if (temp1 <= 5) {
            System.out.println("На улице " + temp1 + " градуса. Нужно одеть шапку");
        }
        if (temp2 > 5) {
            System.out.println("На улице " + temp2 + " градусов. Можно идти без шапки");
        }
        /*Вариант 2*/
        int temp = 3;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градуса. Нужно одеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов. Можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        /*Вариант 1*/
        int speedLimit = 60;
        int speedCar1 = 80;
        int speedCar2 = 50;
        if (speedCar1 > speedLimit) {
            System.out.println("Если скорость " + speedCar1 + " км/ч, то придётся заплатить штраф");
        }
        if (speedCar2 <= speedLimit) {
            System.out.println("Если скорость " + speedCar2 + " км/ч, то можно ехать спонойно");
        }
        /*Вариант 2*/
        int speedCar = 100;
        if (speedCar <= speedLimit) {
            System.out.println("Если скорость " + speedCar + " км/ч, то можно ехать спонойно");
        } else {
            System.out.println("Если скорость " + speedCar + " км/ч, то придётся заплатить штраф");
        }
    }
}