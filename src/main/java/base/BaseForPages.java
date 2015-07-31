package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseForPages {
    public WebDriver driver;

    public BaseForPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

}