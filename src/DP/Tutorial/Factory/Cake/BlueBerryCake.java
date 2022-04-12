package DP.Tutorial.Factory.Cake;

public class BlueBerryCake extends Cake {

    public BlueBerryCake() {
        description();
        prepare();
        bake();
        decorate();
    }

    @Override
    protected void prepare() {
        System.out.println("The " + getClass().getName().substring(25) + " is being prepared");
    }

    @Override
    protected void description() {
        System.out.println("This Blueberry Cake is bursting with soft and sweet blueberries that are sandwiched between a" +
                " layer of white cake and a cinnamon flavored streusel.");
    }
}
