package lesson3;

import java.util.Arrays;
import java.util.Random;

public class Lesson3 {

    public static void main(String[] args) {
        int[] mas = new int[20];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(50);
        }
        System.out.println(Arrays.toString(mas));


        System.out.print("[");
        for (int m : mas) {
            if (m > 0 && m % 2 == 0){
                System.out.print(" "+m+",");
            }
        }
        System.out.println("]");
    }


}
