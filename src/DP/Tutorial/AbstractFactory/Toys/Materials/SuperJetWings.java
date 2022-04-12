package DP.Tutorial.AbstractFactory.Toys.Materials;

public class SuperJetWings implements DP.Tutorial.AbstractFactory.Toys.Materials.Wings {

    public String name = "Super Jet Wings";

    @Override
    public DP.Tutorial.AbstractFactory.Toys.Materials.Wings getWings() {
        return new SuperJetWings();
    }
}
