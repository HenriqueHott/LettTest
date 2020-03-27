package animals;

public class Bat extends Mammal {
    private double flightDistance;

    /** Constructor */
    public Bat(int age, double height, String furColor, double flightDistance) {
        super(age, height, furColor);
        this.flightDistance = flightDistance;
    }

    /** Interface to emmit sound */
    public void emmitSound() {
        System.out.print("Muuuuuu");
    }

    /** Setters/Getters */
    public void setflightDistance(double flightDistance) {
        this.flightDistance = flightDistance;
    }

    double getFlyDistance() {
        return this.flightDistance;
    }

    /** Overrided ToString */
    @Override
    public String toString() {
        return "Bat Age: " + this.age + ", Height: " + this.height + ", " + "FurColor: " + this.furColor
                + "FlyDistance: " + this.flightDistance;
    }

}