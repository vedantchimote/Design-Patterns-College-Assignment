package DP.Tutorial.Singleton;

public class PrimeMinister {

    static private PrimeMinister primeMinister;

    public String name;

    private PrimeMinister() {
        this.name = "Prime Minister of India (Narendra Modi)";

    }

    public static PrimeMinister getPrimeMinister() {
        if (primeMinister == null) {
            return new PrimeMinister();
        }
        return primeMinister;
    }
}
