package lesson2;

public class Lesson2 {// ->Lesson2


    public static void main(String[] args) {//-> main
        int p1 = 5, p2 = 0;
        String str = "/";

        switch (str) {
            case "+":
                System.out.println(p1 + p2);
                break;
            case "-":
                System.out.println(p1 - p2);
                break;
            case "*":
                System.out.println(p1 * p2);
                break;
            case "/":
                System.out.println(p2 == 0 ? "EROOR / by zero" : p1 / p2);
                break;
            default:
                System.out.println("Simbol can not find");
        }

    }//<- main


}//<-Lesson2
