package DP.Tutorial.Singleton;

public class Constitution {

    PrimeMinister primeMinister = PrimeMinister.getPrimeMinister();

    public void set_rules() {
        System.out.println(primeMinister.name + " has set some rules");
    }

    public void give_permission() {
        System.out.println(primeMinister.name + " has given the permission");

    }
}
