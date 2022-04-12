package DP.Tutorial.Factory.Cake;

public class BlackForestCake extends Cake {

    public BlackForestCake() {
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
        System.out.println("This deliciously moist Black Forest Cake is a cut above the rest with homemade whipped cream," +
                " rich chocolate ganache, and sweet spiked cherries.");
    }

}
