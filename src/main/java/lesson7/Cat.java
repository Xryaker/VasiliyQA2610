package lesson7;

public class Cat extends Animal implements Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("Cat"+getName()+"say mow");
    }

    @Override
    public String feed() {
        return "feeding cat "+getName();
    }

    @Override
    public void play() {
        System.out.println("Playing with cat "+getName());
    }

    @Override
    public void walk() {
        System.out.println("walking cat "+getName());
    }
}
