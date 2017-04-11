package headfirst.decorator.starbuzz;

public class Milk extends CondimentDecorator{
    Berverage berverage;
    public Milk(Berverage b){
        this.berverage = b;
    }
    public String getDescription(){
        return berverage.getDescription() + " adding Milk";
    }
    public double getCost(){
        return berverage.getCost() + .50;
    }
}