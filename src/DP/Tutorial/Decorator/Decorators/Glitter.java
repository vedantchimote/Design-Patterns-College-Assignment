package DP.Tutorial.Decorator.Decorators;

public class Glitter extends BouquetDecorator {

    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String name() {
        return "glitter";
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("Glitter has been put on the bouquet");
    }
}
