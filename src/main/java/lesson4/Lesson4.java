package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        Person person=new Person("  ","  ",33);
        System.out.println(person.getAge("day"));

    }

    private static void print(Person p) {
        p.printPretyInfo();
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
