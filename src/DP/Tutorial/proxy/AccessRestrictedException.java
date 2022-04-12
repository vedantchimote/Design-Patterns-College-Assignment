package DP.Tutorial.proxy;

public class AccessRestrictedException extends Exception {

    public AccessRestrictedException() {
        System.out.println("Current user is restricted to access the following site");
    }
}
