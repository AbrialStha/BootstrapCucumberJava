package Utl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by pav15p on 17/02/2017.
 * A factory class for generating different browser
 */
public class BrowserFactory {

    /**
     * Factory method for getting the browser
     * @param browserName
     * @return browser
     */
    public static WebDriver getBrowser(String browserName) {
        WebDriver browser = null;
        switch ( browserName.toLowerCase() ) {
            case "firefox":
                browser = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "E:\\dependecies\\chromedriver.exe");
                browser = new ChromeDriver();
                break;

            default:
                break;
        }
        return browser;
    }
}
