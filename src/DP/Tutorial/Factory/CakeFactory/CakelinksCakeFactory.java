package DP.Tutorial.Factory.CakeFactory;

import DP.Tutorial.Factory.Cake.*;

public class CakelinksCakeFactory extends CakeFactory {


    public static Cake getCake(String cake_name) {

        if (cake_name.toLowerCase() == "blackforest")
            return new BlackForestCake();
        if (cake_name.toLowerCase() == "blueberry")
            return new BlueBerryCake();
        if (cake_name.toLowerCase() == "pineapple")
            return new PineappleCake();
        if (cake_name.toLowerCase() == "redvelvet")
            return new RedVelvetCake();
        else
            return null;
    }

}
