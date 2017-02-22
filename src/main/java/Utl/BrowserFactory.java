package Utl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by pav15p on 17/02/2017.
 * A factory class for generating different browser
 */
public class BrowserFactory {

    // Log class initialization
    private Log log;

    public BrowserFactory() {
        this.log = new Log(this.getClass());
    }

    /**
     * Factory method for getting the browser
     *
     * @param browserName String
     * @return browser WebDriver
     */
    public WebDriver getBrowser(String browserName) {
        WebDriver browser = null;
        switch (browserName.toLowerCase()) {
            case "firefox":
                browser = new FirefoxDriver();
                log.info("this is Firefox Browser");
                break;
            case "chrome":
                log.info("Initialize the chrome Browser");
                System.setProperty("webdriver.chrome.driver", "E:\\dependecies\\chromedriver.exe");
                browser = new ChromeDriver();
                break;
            default:
                break;
        }
        return browser;
    }
}
