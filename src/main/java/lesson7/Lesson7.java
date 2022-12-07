package lesson7;

public class Lesson7 {
    public static void main(String[] args) {

        Cat cat = new Cat("Saly");
        Animal animal = new Cat("Poly");
        animal.greeds();
        Pet pet = new Cat("tom");
      //  pet.walk();
        BigDog bigDog = new BigDog("Kasper");

        bigDog.greeds(new BigDog("sss"));
       // testMathod(bigDog);
        Pet bigdog=new BigDog("kkk");
        Pet pp;

    }

    public static void testMathod(Pet pet) {
        pet.play();
        System.out.println(pet.getNumber(2));

    }
}
