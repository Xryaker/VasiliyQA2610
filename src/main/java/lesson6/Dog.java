package lesson6;

public class Dog extends Animal{

    @Override
    void say() {
        System.out.println("GAV");
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
