package lesson5;

import jdk.jshell.execution.Util;

public class Lesson5 {
    public static void main(String[] args) {
    Dog dog=new Dog("Kasper",1,"grey",false);
        System.out.println(dog.getName());


        Cat cat=new Cat("Bagira",2,new String("grey"),2,"red");
        System.out.println(cat.getEyes().getColor());
        BigCat bigCat=new BigCat("Tiger",2,new String("grey"),2,"red");
        bigCat.playing();

    }
}
