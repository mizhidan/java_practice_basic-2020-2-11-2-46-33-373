package com;

public class Drive {
    public static void main(String[] args) {
        East car = new East('N');
        System.out.println(car.turnLeft());
        System.out.println(car.turnRight());
    }
}
