package DP.Tutorial.AbstractFactory.Toys;

public abstract class Toy {

    public abstract void prepare();

    public void putLable() {
        System.out.println(getClass().getName().substring(33) + " @ Xylem Toy Factory");
    }

    public abstract void putPrice();


}
