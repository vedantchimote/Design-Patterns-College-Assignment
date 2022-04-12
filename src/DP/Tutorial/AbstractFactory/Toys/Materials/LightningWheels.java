package DP.Tutorial.AbstractFactory.Toys.Materials;

public class LightningWheels implements DP.Tutorial.AbstractFactory.Toys.Materials.Wheels {

    public String name = "Lightning wheels";

    @Override
    public DP.Tutorial.AbstractFactory.Toys.Materials.Wheels getWheels() {
        return new LightningWheels();
    }
}
