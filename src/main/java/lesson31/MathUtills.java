package lesson31;

public class MathUtills {
    protected static int sumNumbers(int number1, int number2) {
        return number1 + number2;
    }

    protected static int sumNumbers(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static String someMethod(int number) {
        String str = "not ok";
        return number > 5 ? "ok" : str;
    }

    public static int devide(int t, int i) {
        if (checkNumber(i)) {
            return t / i;
        } else {
            System.out.println("Error / by zero");
            System.exit(0);
        }
        return 0;
    }

    public static int sumFormula(int number, String s, int... args) {
        System.out.println(s);
        int resulSum = 0;
        for (int arg : args) {
            resulSum += arg;
        }
        return resulSum * number;
    }

    private static boolean checkNumber(int i) {
        return i != 0;
    }

    public static void sumNumbers(String s, int number2) {

    }

    public static void sPotolka(int i, String gdgd) {

    }
}
