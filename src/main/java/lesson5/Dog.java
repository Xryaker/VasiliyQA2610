package lesson5;

public class Dog extends Animal {
    private boolean pet;
    private String color;

    public Dog(String name, int age, String color, boolean pet) {
        super(name, age);
        this.pet = pet;
        this.color = color;
    }

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
        this.pet=true;
    }


}
