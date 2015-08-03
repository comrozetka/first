package css_xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CSS_XPATH {

    // CSS
    @FindBy (css = "div > div:nth-of-type(4) > a")  // имена всех телефонов на странице
    private List<WebElement> allNamePhones;

    @FindBy (css = "ul#m-main a[href*='services'][level='level3'][href='http://rozetka.com.ua/services/c153670/']")
    private WebElement services;      //  Ноутбуки, планшеты - Ноутбуки - Услуги

    @FindBy (css = "header-user-link.sprite-side.novisited.xhr")
    private WebElement personalOffice;  // войдите в личный кабинет

    @FindBy(css = "nav.m-main div.m-main-second a:contains('Корма для рыб')")
    private WebElement eatFish;     // Зоотовары - Корма для рыб

    @FindBy(className = "a[title='Одноклассники']")
    private WebElement odnoclassniki;       // соцсети одноклассники


    // XPath

    @FindBy (xpath = "//div[@class='g-i-tile-i-title clearfix']/a")
    private List<WebElement> allNamePhonesX;

    @FindBy(xpath = "//ul[@id='m-main']//a[@level='level3'][@href='http://rozetka.com.ua/services/c153670/']")
    private WebElement servicesX;

    @FindBy(xpath = "//a[text()='войдите в личный кабинет']")
    private WebElement personalOfficeX;

    @FindBy(xpath = "//nav//div[@class='m-main-second']//a[contains(text(),'Корма для рыб')]")
    private WebElement eatFishX;

    @FindBy(xpath = "//a[@title='Одноклассники']")
    private WebElement odnoclassnikiX;


    }
