package test.utilities;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Configuration.*;

public class BrowserFactory {

    public static WebDriver getDriver (String browserName) throws Exception {
        browserName = browserName.toUpperCase();
        switch (BrowserName.valueOf(browserName)) {
            case CHROME:
                return setUpRemoteTestsChrome();
            case FIREFOX:
                return setUpRemoteTestsFirefox();
        }
        throw new Exception("Browser driver are incorrect");
    }

    public static WebDriver setUpRemoteTestsChrome() {
        remote = "http://remote.host/wd/hub";
        browser = "chrome";
        browserSize = "1920x1080";
        return null;
    }

    public static WebDriver setUpRemoteTestsFirefox() {
        remote = "http://remote.host/wd/hub";
        browser = "firefox";
        browserSize = "1920x1080";
        return null;
    }
}
