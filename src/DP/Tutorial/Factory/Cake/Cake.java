package DP.Tutorial.Factory.Cake;

public abstract class Cake {

    protected abstract void prepare();

    protected abstract void description();

    protected void bake() {
        System.out.println("The " + getClass().getName().substring(25) + " is being baked");
    }

    protected void decorate() {
        System.out.println("The " + getClass().getName().substring(25) + " is being decorated");
    }


}

