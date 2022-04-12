package DP.Tutorial.Decorator.Decorators;

public class Ribbion extends BouquetDecorator {

    @Override
    public int cost() {
        return 20;
    }

    @Override
    public String name() {
        return "ribbion";
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Ribbions are wrapped around the bouquet");
    }
}
