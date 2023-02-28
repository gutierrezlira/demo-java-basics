package by.itacademy.alinadarenskikh.javabasics;

public class Greeting {
    public static void main(String[] args) {
        if (args.length == 0){
        System.out.print("Введите ваше имя в командной строке!");}
        else {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
    }
}
