package DP.Tutorial.AbstractFactory.Toys;

import DP.Tutorial.AbstractFactory.ToyStore.Car;
import DP.Tutorial.AbstractFactory.Toys.Materials.Keys;
import DP.Tutorial.AbstractFactory.Toys.Materials.LightningKeys;
import DP.Tutorial.AbstractFactory.Toys.Materials.LightningWheels;
import DP.Tutorial.AbstractFactory.Toys.Materials.Wheels;

public class NewStyleCar extends DP.Tutorial.AbstractFactory.Toys.Toy implements Car {

    Keys key;
    Wheels wheel;

    public NewStyleCar() {
        prepare();
        putLable();
        putPrice();
    }

    @Override
    public void prepare() {

        key = new LightningKeys().getKeys();
        wheel = new LightningWheels().getWheels();

        System.out.println("In the new style car " + new LightningKeys().name + " and " + new LightningWheels().name + " are installed");
    }

    @Override
    public void putPrice() {
        System.out.println("Price of the New Style Car is Rs 500");
    }
}
