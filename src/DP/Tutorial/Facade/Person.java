package DP.Tutorial.Facade;

public class Person {

    Phone phone;

    public Person() {

        phone = Phone.getPhone();

    }
}
