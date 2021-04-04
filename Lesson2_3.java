package Lesson2;

public class Lesson2_3 {

    public static void printTextNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);

        }
    }
    public static void main(String[] args) {
        printTextNTimes("Hello", 5);
    }
}
