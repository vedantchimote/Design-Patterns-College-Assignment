package DP.Tutorial.Decorator.Decorators;

public class Vase extends BouquetDecorator {


    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String name() {
        return "vase";
    }


    @Override
    public void decorate() {
        super.decorate();
        System.out.println("The bouquet is mounted in the vase");
    }
}
