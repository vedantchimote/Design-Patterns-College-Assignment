package DP.Tutorial.Factory.Cake;

public class RedVelvetCake extends Cake {

    public RedVelvetCake() {
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
        System.out.println("Red velvet cake is traditionally a red, red-brown, crimson, " +
                "or scarlet-colored chocolate layer cake, layered with ermine icing.");
    }
}
