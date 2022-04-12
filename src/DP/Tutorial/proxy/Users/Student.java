package DP.Tutorial.proxy.Users;

import DP.Tutorial.proxy.ProxyInternet;

public class Student extends User {

    private ProxyInternet proxyInternet;

    public Student() {
        this.proxyInternet = new ProxyInternet();
    }

    @Override
    public void useInternet(String site) throws Exception {

        proxyInternet.connect(getClass().getName().substring(24), site);

    }

}
