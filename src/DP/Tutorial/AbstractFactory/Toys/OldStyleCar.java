package DP.Tutorial.AbstractFactory.Toys;

import DP.Tutorial.AbstractFactory.ToyStore.Car;
import DP.Tutorial.AbstractFactory.Toys.Materials.Keys;
import DP.Tutorial.AbstractFactory.Toys.Materials.MusicKeys;
import DP.Tutorial.AbstractFactory.Toys.Materials.MusicWheels;
import DP.Tutorial.AbstractFactory.Toys.Materials.Wheels;

public class OldStyleCar extends DP.Tutorial.AbstractFactory.Toys.Toy implements Car {

    Keys key;
    Wheels wheel;

    public OldStyleCar() {
        prepare();
        putLable();
        putPrice();
    }

    @Override
    public void prepare() {

        key = new MusicKeys().getKeys();
        wheel = new MusicWheels().getWheels();

        System.out.println("In the old style car " + new MusicKeys().name + " and " + new MusicWheels().name + " are installed");
    }

    @Override
    public void putPrice() {
        System.out.println("Price of the Old Style Car is Rs 300");
    }
}
