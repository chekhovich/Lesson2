package Lesson2;

public class Lesson2_2 {
    public static void main(String[] args) {
        PositiveOrNegative();
    }
    public static void PositiveOrNegative () {
        int x = -5;
        if (x <= 0) {
            System.out.println("Отрицательное");
        }
        else {
            System.out.println("Положительное");
        }
    }
}
