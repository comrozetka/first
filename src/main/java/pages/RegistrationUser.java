package pages;

import base.BaseForPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class RegistrationUser extends BaseForPages {

    @FindBy(css = "#personal_information")
    public WebElement personalInformation;
    @FindBy(name = "signin")
    private WebElement signIn;
    @FindBy(css = ".novisited.auth-f-signup-link")
    private WebElement registration;
    @FindBy(name = "title")
    private WebElement typeName;
    @FindBy(name = "email")
    private WebElement typeEmail;
    @FindBy(name = "password")
    private WebElement typePassword;
    @FindBy(xpath = ".//div/span/button")
    private WebElement registrationButton;
    @FindBy(css = ".social-bind-tiny-close.novisited")
    private WebElement closeWindow;

    public RegistrationUser(WebDriver driver, String s) {
        super(driver);
    }


    public void goToRegistration() {
        signIn.click();
        registration.click();
    }

    public void sendName(String name) {
        typeName.sendKeys(name);
    }

    public void sendEmail(String email) {
        typeEmail.sendKeys(email);

    }

    public void sendPassword(String password) {
        typePassword.sendKeys(password);
    }

    public void clickRegistration() throws InterruptedException {
        registrationButton.click();
        TimeUnit.SECONDS.sleep(2);          // waiting second frame for close
        closeWindow.click();
    }
}



