package practice;

public class Vegetable extends Plant {
    protected String colour;
    protected double weightInKg;
    public Vegetable(String name){
        super(name);
    }

    public Vegetable(String name, String colour, double weightInKg){
        super(name);
        this.colour = colour;
        this.weightInKg = weightInKg;
    }

}
