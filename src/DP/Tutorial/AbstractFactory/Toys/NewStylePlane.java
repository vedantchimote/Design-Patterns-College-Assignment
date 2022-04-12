package DP.Tutorial.AbstractFactory.Toys;

import DP.Tutorial.AbstractFactory.ToyStore.Plane;
import DP.Tutorial.AbstractFactory.Toys.Materials.*;

public class NewStylePlane extends DP.Tutorial.AbstractFactory.Toys.Toy implements Plane {

    Keys key;
    Wheels wheel;
    Wings wings;

    public NewStylePlane() {
        prepare();
        putLable();
        putPrice();
    }

    @Override
    public void prepare() {

        key = new LightningKeys().getKeys();
        wheel = new LightningWheels().getWheels();
        wings = new SuperJetWings().getWings();

        System.out.println("In the new style plane " + new LightningKeys().name + ", " + new LightningWheels().name + " and " +
                new SuperJetWings().name + " are installed");
    }

    @Override
    public void putPrice() {
        System.out.println("Price of the New Style Plane is Rs 1100");
    }

}
