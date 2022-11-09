package lesson5;

import java.util.Arrays;
import java.util.Random;

public class Utils {

    public static int sum(int[] massive) {
        int sum = 0;
        for (int m : massive) {
            sum += m;
        }
        return sum;
    }

    public static int[] createMassive(int length) {
        int[] mas = new int[length];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(50);
        }
        System.out.println(Arrays.toString(mas));
        return mas;
    }
}
