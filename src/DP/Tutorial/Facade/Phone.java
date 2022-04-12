package DP.Tutorial.Facade;

import DP.Tutorial.Facade.Applications.MusicApp;
import DP.Tutorial.Facade.Applications.SportsTrackerApp;
import DP.Tutorial.Facade.Applications.Twitter;
import DP.Tutorial.Facade.Features.GPS;
import DP.Tutorial.Facade.Features.MobileData;
import DP.Tutorial.Facade.Features.Wifi;

public class Phone {

    static Wifi wifi;
    static MobileData mobileData;
    static GPS gps;
    static MusicApp musicApp;
    static SportsTrackerApp sportsTrackerApp;
    static Twitter twitter;
    private static Phone phone;

    private Phone() {
    }

    public static Phone getPhone() {

        if (phone == null) {
            wifi = new Wifi();
            mobileData = new MobileData();
            gps = new GPS();
            musicApp = new MusicApp();
            sportsTrackerApp = new SportsTrackerApp();
            twitter = new Twitter();
            return new Phone();
        }
        return phone;
    }


    public void leaveHome() {

        wifi.turnOff();
        mobileData.turnOn();
        gps.turnOn();
        musicApp.playMusic();
        sportsTrackerApp.beginSportsTracking();
    }

    public void returnHome() {

        sportsTrackerApp.endSportsTracking();
        twitter.shareStatus();
        musicApp.stopMusic();
        gps.turnOff();
        mobileData.turnOff();
        wifi.turnOn();

    }
}
