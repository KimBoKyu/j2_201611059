package headfirst.decorator.starbuzz;

public class Whip extends CondimentDecorator{
    Berverage berverage;
    public Whip(Berverage b){
        this.berverage = b;
    }
    public String getDescription(){
        return berverage.getDescription() + " adding Whip";
    }
    public double getCost(){
        return berverage.getCost() + .20;
    }
}