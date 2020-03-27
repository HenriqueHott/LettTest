package animals;

public class Chicken extends Bird {

    public Chicken(int age, double height, String featherColor) {
        super(age, height, featherColor);
    }

    public void emmitSound() {
        System.out.print("Carico Caricoooo Caricooo");
    }

    @Override
    public String toString() {
        return "Chiken " + "Age:" + this.age + ", Height:" + this.age + ", FeatherColor: " + this.featherColor;
    }

}