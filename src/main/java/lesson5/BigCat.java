package lesson5;

public class BigCat extends Cat{


    public BigCat(String name, int age, String color, int sumEyes, String colorEyes) {
        super(name, age, color, sumEyes, colorEyes);
    }
    public void playing(){
        System.out.println(getName()+" plaing");
    }

}
