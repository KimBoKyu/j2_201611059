package headfirst.decorator.starbuzz;

public class Caramel extends CondimentDecorator{
    Berverage berverage;
    public Caramel(Berverage b){
        this.berverage = b;
    }
    public String getDescription(){
        return berverage.getDescription() + " adding Caramel";
    }
    public double getCost(){
        return berverage.getCost() + .45;
    }
}