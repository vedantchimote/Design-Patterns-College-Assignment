package DP.Tutorial.Decorator.Bouquets;

import DP.Tutorial.Decorator.Decorators.BouquetDecorator;

public abstract class Bouquet {

    public abstract void getDescription();

    public abstract void getCost();

    public abstract void decorate(BouquetDecorator... bouquetDecorator);

}
