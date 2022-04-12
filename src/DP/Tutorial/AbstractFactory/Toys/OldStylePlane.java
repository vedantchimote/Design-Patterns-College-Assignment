package DP.Tutorial.AbstractFactory.Toys;

import DP.Tutorial.AbstractFactory.ToyStore.Plane;
import DP.Tutorial.AbstractFactory.Toys.Materials.*;

public class OldStylePlane extends DP.Tutorial.AbstractFactory.Toys.Toy implements Plane {

    Keys key;
    Wings wing;
    Wheels wheel;

    public OldStylePlane() {
        prepare();
        putLable();
        putPrice();
    }

    @Override
    public void prepare() {

        key = new MusicKeys().getKeys();
        wing = new JetWings().getWings();
        wheel = new MusicWheels().getWheels();

        System.out.println("In the old style plane " + new MusicKeys().name + ", " + new MusicWheels().name + " and " +
                new JetWings().name + " are installed");

    }

    @Override
    public void putPrice() {
        System.out.println("Price of the Old Style Plane is Rs 800");
    }

}
