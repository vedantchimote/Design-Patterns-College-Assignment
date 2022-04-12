package DP.Tutorial.AbstractFactory.ToyStore;

import DP.Tutorial.AbstractFactory.Toys.NewStyleCar;
import DP.Tutorial.AbstractFactory.Toys.NewStylePlane;
import DP.Tutorial.AbstractFactory.Toys.OldStyleCar;
import DP.Tutorial.AbstractFactory.Toys.OldStylePlane;

public class ToyStore {

    DP.Tutorial.AbstractFactory.ToyStore.Plane plane;
    DP.Tutorial.AbstractFactory.ToyStore.Car car;

    public DP.Tutorial.AbstractFactory.ToyStore.Plane getPlane(String type) {
        if (type.toLowerCase() == "new")
            this.plane = new NewStylePlane();
        if (type.toLowerCase() == "old")
            this.plane = new OldStylePlane();
        return plane;
    }

    public DP.Tutorial.AbstractFactory.ToyStore.Car getCar(String type) {
        if (type.toLowerCase() == "new")
            this.car = new NewStyleCar();
        if (type.toLowerCase() == "old")
            this.car = new OldStyleCar();
        return car;
    }

}
