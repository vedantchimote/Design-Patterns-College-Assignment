package DP.Tutorial.Decorator;

import DP.Tutorial.Decorator.Bouquets.Bouquet;
import DP.Tutorial.Decorator.Bouquets.Orchid;
import DP.Tutorial.Decorator.Bouquets.Rose;
import DP.Tutorial.Decorator.Bouquets.Sunflower;
import DP.Tutorial.Decorator.Decorators.*;

public class FlouristShop {

    public static void main(String[] args) {

        System.out.println("Welcome to EverFresh Shop");
        System.out.println();

        Bouquet bouquet = new Sunflower();
        bouquet.decorate(new Vase(), new Bleach(), new Ribbion(), new Water(), new Glitter());

        System.out.println();

        bouquet = new Rose();
        bouquet.decorate(new Ribbion(), new Water(), new Glitter());

        System.out.println();

        bouquet = new Orchid();
        bouquet.decorate(new Vase(), new Ribbion(), new Glitter());


    }
}
