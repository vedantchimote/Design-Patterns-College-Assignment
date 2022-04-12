package DP.Tutorial.Factory;

import DP.Tutorial.Factory.Cake.Cake;
import DP.Tutorial.Factory.CakeFactory.ABCCakeFactory;
import DP.Tutorial.Factory.CakeFactory.CakelinksCakeFactory;

public class CakeFactoryTest {

    public static void main(String[] args) {

        Cake cake1 = CakelinksCakeFactory.getCake("blackforest");
        System.out.println();
        Cake cake2 = ABCCakeFactory.getCake("pineapple");
        System.out.println();
        Cake cake3 = ABCCakeFactory.getCake("redvelvet");


    }
}
