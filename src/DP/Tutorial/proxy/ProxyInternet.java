package DP.Tutorial.proxy;

import java.util.ArrayList;
import java.util.List;


public class ProxyInternet {
    private static List<String> allowedSites_for_students;

    static {
        allowedSites_for_students = new ArrayList<>();
        allowedSites_for_students.add("nptel.com");
        allowedSites_for_students.add("geeksforgeeks.com");
        allowedSites_for_students.add("javatpoint.com");
    }

    private RealInternet realInternet = new RealInternet();
    private RestrictedInternet restrictedInternet = new RestrictedInternet();

    public void connect(String user, String site) throws Exception {
        if (user != null && user.trim().equals("Student")) {
            if (allowedSites_for_students.contains(site.toLowerCase())) {
                restrictedInternet.connectTo(site);
            } else {
                throw new AccessRestrictedException();
            }

        }
        if (user != null) {
            if (user.trim().equals("Teacher") || user.trim().equals("NonTeachingStaffMember")) {
                realInternet.connectTo(site);
            }
        }

    }


}