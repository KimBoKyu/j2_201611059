package headfirst.decorator.starbuzz;

public class Vanilla extends CondimentDecorator{
    Berverage berverage;
    public Vanilla(Berverage b){
        this.berverage = b;
    }
    public String getDescription(){
        return berverage.getDescription() + " adding Vanilla";
    }
    public double getCost(){
        return berverage.getCost() + .50;
    }
}