package DP.Tutorial.AbstractFactory.Toys.Materials;

public class JetWings implements DP.Tutorial.AbstractFactory.Toys.Materials.Wings {

    public String name = "Jet Wings";

    @Override
    public DP.Tutorial.AbstractFactory.Toys.Materials.Wings getWings() {
        return new JetWings();
    }
}
