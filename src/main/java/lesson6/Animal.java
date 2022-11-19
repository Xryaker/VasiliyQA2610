package lesson6;

public abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    abstract void say();
    @Override
    public String toString() {
        return "Object Animal, name : "+getName()+" age : "+getAge();
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
