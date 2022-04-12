package DP.Tutorial.Decorator.Bouquets;

import DP.Tutorial.Decorator.Decorators.BouquetDecorator;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Rose extends Bouquet {

    private BouquetDecorator bouquetDecorator;
    private int cost = 150;

    @Override
    public void getDescription() {
        System.out.println("You have ordered Rose Bouquet");
    }

    @Override
    public void getCost() {

        System.out.println("The total cost of the bouquet is Rs " + this.cost);

    }

    public void decorate(BouquetDecorator... bouquetDecorator) {

        this.getDescription();
        ArrayList<BouquetDecorator> list = new ArrayList<>();
        ArrayList<String> list_of_decorators = new ArrayList<>();

        for (BouquetDecorator b : bouquetDecorator) {
            list.add(b);
            b.decorate();
            this.cost += b.cost();
            list_of_decorators.add(b.name());
        }

        System.out.println("So all the decorators added to the bouquet are" + " " + list_of_decorators.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")));

        this.getCost();

    }

}
