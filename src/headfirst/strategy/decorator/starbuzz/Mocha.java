package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
    Berverage berverage;
    public Mocha(Berverage b){
        this.berverage = b;
    }
    public String getDescription(){
        return berverage.getDescription() + " adding Mocha";
    }
    public double getCost(){
        return berverage.getCost() + .20;
    }
}