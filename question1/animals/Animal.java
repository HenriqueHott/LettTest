package animals;

/**
 * Abstct Class to define Animal abstraction Implemetion of IAnimal must be done
 * by submethods
 */
public abstract class Animal implements IAnimal {
    protected int age;
    protected double height;

    /* Constructor */
    public Animal(int age, double height) {
        this.age = age;
        this.height = height;
    }

    /** Setters/Getters */
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

}