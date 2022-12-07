package lesson7;

public class Dog extends Animal implements Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("dog "+getName()+" says woof");
    }
    void greeds(Dog dog){
        System.out.println("woof");
    }

    @Override
    public String feed() {
        return "feeding "+getName();
    }

    @Override
    public void play() {
        System.out.println( "dog "+getName()+" playing");
    }

    @Override
    public void walk() {
        System.out.println( "dog "+getName()+" walking");
    }
}
