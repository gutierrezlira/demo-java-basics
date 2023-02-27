package by.itacademy.alinadarenskikh.javabasics;

import java.util.Scanner;

public class News {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество новостей: ");
        int numberOfNews = scanner.nextInt();

        int newsPerPage = 10;
        int totalPages = (int)Math.ceil((double) numberOfNews/newsPerPage);

        System.out.println("Количество страниц: " + totalPages);
    }
}
