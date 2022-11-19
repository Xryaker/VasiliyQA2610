package lesson6;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
        this.age=16;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        } else {
            this.age = 16;
        }
    }
}
