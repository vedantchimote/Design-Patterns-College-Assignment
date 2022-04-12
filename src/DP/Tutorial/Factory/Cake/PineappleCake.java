package DP.Tutorial.Factory.Cake;

public class PineappleCake extends Cake {

    public PineappleCake() {
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
        System.out.println("This classic and retro pineapple upside down cake is soft and buttery with a " +
                "caramelized brown sugar pineapple & cherry topping.");
    }
}
