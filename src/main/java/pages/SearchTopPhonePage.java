package pages;

import base.BaseForPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchTopPhonePage extends BaseForPages {

    @FindBy(xpath = "*//i[contains(@class,'g-tag') and contains(@class,'g-tag-icon-middle-popularity')]/ancestor::div[3]//div[4]/a")
    private List<WebElement> searchTopNamePhone;

    @FindBy(xpath = "*//i[contains(@class,'g-tag') and contains(@class,'g-tag-icon-middle-popularity')]/ancestor::div[3]//div[@class='g-price-uah']")
    private List<WebElement> searchTopPricePhone;

    public SearchTopPhonePage(WebDriver driver) {
        super(driver);
    }


    public ArrayList<String> printToFileNamePhones(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < searchTopNamePhone.size(); i++) {
            arrayList.add(searchTopNamePhone.get(i).getText() + " = " + searchTopPricePhone.get(i).getText());
            fileWriter.write(arrayList.get(i) + "\r\n");
        }
        fileWriter.write("==========================================================================" + "\r\n");
        fileWriter.close();
        return arrayList;
    }

    public void goToPage(int number) {
        driver.findElement(By.linkText(String.valueOf(number))).click();
    }
}
