package by.itacademy.alinadarenskikh.javabasics;

public class CircleArea {
    public static void main(String[] args) {

        double radius = 5.0;
        double area = calculateCircleArea(radius);

        System.out.println("Площадь круга с радиусом " + radius + " равна " + area);
    }

    public static double calculateCircleArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }
}
