package pages;

import base.BaseForPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchAllSmartPhones extends BaseForPages {

    public SearchAllSmartPhones(WebDriver driver) {
        super(driver);
    }

    public SearchTopPhonePage setLink(String text) {
        driver.findElement(By.partialLinkText(text)).click();
        return new SearchTopPhonePage(driver);
    }


}
