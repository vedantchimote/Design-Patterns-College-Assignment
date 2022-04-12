package DP.Tutorial.AbstractFactory.Toys.Materials;

public class LightningKeys extends DP.Tutorial.AbstractFactory.Toys.Materials.Keys {

    public String name = "Lightning keys";

    @Override
    public DP.Tutorial.AbstractFactory.Toys.Materials.Keys getKeys() {
        return new LightningKeys();
    }
}
