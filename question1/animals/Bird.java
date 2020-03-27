package animals;

abstract class Bird extends Animal {
    protected String featherColor;

    /* Constructor */
    public Bird(final int age, final double height, final String featherColor) {
        super(age, height);
        this.featherColor = featherColor;
    }

    /* Setters/Getters */
    public void setFeatherColor(final String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return this.featherColor;
    }
}