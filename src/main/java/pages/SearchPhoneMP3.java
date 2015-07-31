package pages;

import base.BaseForPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPhoneMP3 extends BaseForPages {


    public SearchPhoneMP3(WebDriver driver) {
        super(driver);
    }

    public SearchSmartPhones setLink(String text) {
        driver.findElement(By.partialLinkText(text)).click();
        return new SearchSmartPhones(driver);
    }
}
