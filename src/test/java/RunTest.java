import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RunTest {

    final static String BASE_URL = "https://rozetka.com.ua";
    final static String FILE_NAME = "D:\\resultOfTest.txt";

    RegistrationUser registrationUser;
    SearchPhoneMP3 searchPhoneMP3;
    SearchSmartPhones searchSmartPhones;
    SearchAllSmartPhones searchAllSmartPhones;
    SearchTopPhonePage searchTopPhonePage;
    WebDriver webDriver;


    @BeforeTest
    public void beforeTest() {
        webDriver = new FirefoxDriver();
        webDriver.get(BASE_URL);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//fgdfgdf ggbthbhbt hbtyhbtyhbtyyhtybhybhytbh


    }

    @Test
    public void searchAllPhones() {
            try {
            searchPhoneMP3 = PageFactory.initElements(webDriver, SearchPhoneMP3.class);
            searchSmartPhones = searchPhoneMP3.setLink("MP3");
            TimeUnit.SECONDS.sleep(2);
            searchAllSmartPhones = searchSmartPhones.setLink("Смартфоны");
            TimeUnit.SECONDS.sleep(2);
            searchTopPhonePage = searchAllSmartPhones.setLink("Все");
            searchTopPhonePage.printToFileNamePhones(FILE_NAME);
            searchTopPhonePage.goToPage(2);
            searchTopPhonePage.printToFileNamePhones(FILE_NAME);
            searchTopPhonePage.goToPage(3);
            searchTopPhonePage.printToFileNamePhones(FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void aftertest() {
        webDriver.quit();
    }
}
