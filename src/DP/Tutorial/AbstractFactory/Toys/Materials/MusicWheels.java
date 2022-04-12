package DP.Tutorial.AbstractFactory.Toys.Materials;

public class MusicWheels implements DP.Tutorial.AbstractFactory.Toys.Materials.Wheels {

    public String name = "Music wheels";

    @Override
    public DP.Tutorial.AbstractFactory.Toys.Materials.Wheels getWheels() {
        return new MusicWheels();
    }
}
