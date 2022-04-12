package DP.Tutorial.AbstractFactory.Toys.Test;

import DP.Tutorial.AbstractFactory.ToyStore.Car;
import DP.Tutorial.AbstractFactory.ToyStore.Plane;
import DP.Tutorial.AbstractFactory.ToyStore.ToyStore;

public class Test {

    public static void main(String[] args) {

        ToyStore toyStore = new ToyStore();

        Car car1 = toyStore.getCar("new");
        System.out.println();
        Car car2 = toyStore.getCar("old");
        System.out.println();
        Plane plane1 = toyStore.getPlane("new");
        System.out.println();
        Plane plane2 = toyStore.getPlane("old");


    }
}
