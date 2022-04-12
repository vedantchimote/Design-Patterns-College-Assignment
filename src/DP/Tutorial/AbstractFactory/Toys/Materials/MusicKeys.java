package DP.Tutorial.AbstractFactory.Toys.Materials;

public class MusicKeys extends DP.Tutorial.AbstractFactory.Toys.Materials.Keys {

    public String name = "Music keys";

    @Override
    public DP.Tutorial.AbstractFactory.Toys.Materials.Keys getKeys() {
        return new MusicKeys();
    }
}
