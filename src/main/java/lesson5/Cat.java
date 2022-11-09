package lesson5;

public class Cat extends Animal {
    private  String color;

    public Eyes getEyes() {
        return eyes;
    }

    private     Eyes eyes;

    public Cat(String name, int age, String color, int sumEyes,String colorEyes) {
        super(name, age);
        this.color = color;
        this.eyes = new Eyes(sumEyes, colorEyes);
    }
     class Eyes {
       private int sum;
        private String color;

        public Eyes(int sum, String color) {
            this.sum = sum;
            this.color = color;
        }

        public int getSum() {
            return sum;
        }

        public String getColor() {
            return color;
        }
    }
}
