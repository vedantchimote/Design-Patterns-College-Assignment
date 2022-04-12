package DP.Tutorial.proxy;

public class RestrictedInternet implements Internet {
    @Override
    public void connectTo(String site) {

        System.out.println("This is special restricted internet for students");
        System.out.println("Connecting to " + site);
        System.out.println("Connected to " + site);

    }
}
