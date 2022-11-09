package lesson5;

public class Animal {
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

      public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
