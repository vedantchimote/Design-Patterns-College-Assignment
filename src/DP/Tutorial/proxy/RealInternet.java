package DP.Tutorial.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String site) {
        System.out.println("This is real internet accessible to everyone except students with no restriction");
        System.out.println("Connecting to " + site);
        System.out.println("Connected to " + site);
    }
}
