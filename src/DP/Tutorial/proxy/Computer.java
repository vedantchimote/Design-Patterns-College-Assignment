package DP.Tutorial.proxy;

import DP.Tutorial.proxy.Users.NonTeachingStaffMember;
import DP.Tutorial.proxy.Users.Student;
import DP.Tutorial.proxy.Users.Teacher;

public class Computer {

    public static void main(String[] args) throws Exception {

        System.out.println("Student is trying to access certain site");
        Student student1 = new Student();
        student1.useInternet("nptel.com");

        System.out.println();

        System.out.println("Teacher is trying to access certain site");
        Teacher teacher = new Teacher();
        teacher.useInternet("yahoo.com");

        System.out.println();

        System.out.println("NonTeachingStaffMember is trying to access certain site");
        NonTeachingStaffMember nonTeachingStaffMember = new NonTeachingStaffMember();
        nonTeachingStaffMember.useInternet("instagram.com");

        System.out.println();

        //If a student tries to access the site that is restricted
        student1.useInternet("instagram.com");
    }
}
