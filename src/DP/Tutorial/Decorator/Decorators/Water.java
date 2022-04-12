package DP.Tutorial.Decorator.Decorators;

public class Water extends BouquetDecorator {

    @Override
    public int cost() {
        return 5;
    }

    @Override
    public String name() {
        return "water";
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Water has been sprinkled on the bouquet");
    }
}
