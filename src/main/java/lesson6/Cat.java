package lesson6;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Cat(String name) {
        super(name, 45);
        this.color="grey";
    }

    public void say(){
        System.out.println("myau");
    }
    public void print(){
        System.out.println("print info");
    }

    @Override
    public String toString() {
        return "Object Cat, name : "+getName()+" age : "+getAge();
    }

    @Override
    public int getAge() {
        return super.getAge()*3;
    }
}
