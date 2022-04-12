package DP.Tutorial.Decorator.Decorators;

public class Bleach extends BouquetDecorator {

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String name() {
        return "bleach";
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("The bouquet has been bleached");
    }
}
