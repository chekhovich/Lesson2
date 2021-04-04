package Lesson2;
public class Lesson_2 {
    public static void main(String[] args) {
        within10to20();
    }
    public static void within10to20() {
        int a = 5;
        int b = 20;
        int c = a + b;
        if (c > 10 && c <= 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
