package animals;

public class Cow extends Mammal {

    public Cow(int age, double height, String furColor) {
        super(age, height, furColor);
    }

    public void emmitSound() {
        System.out.print("Muuuuuu");
    }

    @Override
    public String toString() {
        return "Cow Age: " + this.age + ", Height: " + this.height + ", " + "FurColor: " + this.furColor;
    }
}