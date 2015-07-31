package pages;

import base.BaseForPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchSmartPhones extends BaseForPages {


    public SearchSmartPhones(WebDriver driver) {
        super(driver);
    }

    public SearchAllSmartPhones setLink(String text) {
        driver.findElement(By.partialLinkText(text)).click();
        return new SearchAllSmartPhones(driver);
    }
}
