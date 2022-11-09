package lesson4;

public class Person {
    public static String typeDNK="HUMAN";

    private String name, family;
    private int age;

    public void setAge(int age) {
        this.age = validateAge(age);
    }

    public static String getTypeDNK() {
        return typeDNK;
    }

    public String getFamily() {
        return family;
    }

    public int getAge(String type) {
        if(type=="year"){
            return age;
        }else{
            return age*365;
        }
    }
    public int getAge() {
            return age;
    }

    public String getName() {
        return name;
    }

    public Person() {
        this.name="John";
        this.family="Dou";
    }

    public Person(String nam, String family, int age) {

        this.name = checckName(nam);
        this.family = family;
      this.age=validateAge(age);
    }

    private int validateAge(int age) {
        if (age > 16 && age < 105) {
            return  age;
        } else {
            return  16;
        }
    }

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
        this.age = 33;
    }

    private String checckName(String nam) {
        return nam.toUpperCase();
    }

    public void printPretyInfo() {
        System.out.println("Name : " + loweCase(this.name));
        System.out.println("Family : " + this.family);
        System.out.println("Type : "+typeDNK);
        System.out.println("Age : "+this.age);
    }

    private String loweCase(String name) {
        return name == null ? null : name.toUpperCase();
    }
}
