package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pav15p on 17/02/2017.
 */
public abstract class Page {

    public Page(WebDriver Driver) {
        PageFactory.initElements(Driver, this);
    }

}
