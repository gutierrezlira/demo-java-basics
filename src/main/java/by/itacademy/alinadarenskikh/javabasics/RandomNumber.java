package by.itacademy.alinadarenskikh.javabasics;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int number = 5;
        int randomNumber = generateRandomNumber(number);
        System.out.println("Случайное " + number + "-значное число: " + randomNumber);
    }

    public static int generateRandomNumber(int number) {
        Random random = new Random();

        int min = (int) Math.pow(10, number - 1);
        int max = (int) Math.pow(10, number - 1);

        return random.nextInt((max - min) + 1, min);
    }
}
