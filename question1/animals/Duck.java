package animals;

public class Duck extends Bird {
    private double flightDistance;

    public Duck(int age, double height, String featherColor, double flightDistance) {
        super(age, height, featherColor);
        this.flightDistance = flightDistance;
    }

    public void emmitSound() {
        System.out.print("Qua Qua Qua Qua");
    }

    public void setFlightDistance(double flightDistance) {
        this.flightDistance = flightDistance;
    }

    public double getFlightDistance() {
        return flightDistance;
    }

    @Override
    public String toString() {
        return "Duck " + "Age:" + this.age + ", Height:" + this.age + ", FeatherColor: " + this.featherColor
                + ", FlightDistance: " + this.flightDistance;
    }

}