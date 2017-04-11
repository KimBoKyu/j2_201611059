package headfirst.decorator.starbuzz;

public class Espresso extends Berverage{
    public Espresso(){
        description = "Espresso";
    }
    public double getCost(){
        return 1.99;
    }
}