package DP.Tutorial.Facade;

public class Home {

    public static void main(String[] args) {

        Person person = new Person();

        System.out.println("While leaving home");
        person.phone.leaveHome();

        System.out.println();

        System.out.println("While returning home");
        person.phone.returnHome();

    }

}
