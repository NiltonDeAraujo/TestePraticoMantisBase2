package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private Driver drive;

    @Before
    public void startBrowser() {
        drive = new Driver();
        drive.startDriver(Browser.CHROME);
    }

   @After
    public void finishedBrowser() {
        drive.closeBrowser();
    }


}
