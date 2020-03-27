package animals;

public abstract class Mammal extends Animal {
    protected String furColor;

    /* Constructor */
    public Mammal(int age, double height, String furColor) {
        super(age, height);
        this.furColor = furColor;
    }

    /* Setters/Getters */
    public void setFurcolor(String furColor) {
        this.furColor = furColor;
    }

    public String getFurcolor() {
        return this.furColor;
    }

}