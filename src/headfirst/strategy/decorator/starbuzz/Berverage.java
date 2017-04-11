package headfirst.decorator.starbuzz;

public abstract class Berverage{
    String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double getCost();
}
