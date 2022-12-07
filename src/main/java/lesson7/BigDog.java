package lesson7;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(!(obj instanceof BigDog bigDog)) return false;
        return this.getName().equals(bigDog.getName());
    }

    @Override
    public String toString() {
        return getName() + " BIGDOG";
    }

    @Override
    void greeds() {
        System.out.println("woow");
    }

    @Override
    void greeds(Dog dog) {
        System.out.println("wooow");
    }

    void greeds(BigDog bigDog) {
        System.out.println("wooooooow");
    }


}
