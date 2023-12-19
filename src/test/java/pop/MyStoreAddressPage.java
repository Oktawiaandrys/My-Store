package pop;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class MyStoreAddressPage {
    private WebDriver driver;
    @FindBy(css = "#content > div.addresses-footer > a > i")
    private WebElement addressCreateButton;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/h4")
    private WebElement aliasTwo;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]")
    private WebElement addressTwo;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]")
    private WebElement deleteAddressTwo;
    @FindBy(css = "#notifications > div > article > ul > li")
    private WebElement notification;

    public MyStoreAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createNewAddress() {
        addressCreateButton.click();
    }

    public void deleteAddressTwo(){deleteAddressTwo.click();}

    public void checkAlias(String looked) {
        String actual = aliasTwo.getText();
        assertEquals(looked, actual);
        if (!actual.contains(looked)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", looked, actual));
        }
    }

    public void checkAddress(String looked) {
        String actual = addressTwo.getText();
        if (!actual.contains(looked)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", looked, actual));
        }
    }

    public void notificationEquals() {
        String looked = "Address successfully deleted!";
        String actual = notification.getText();
        assertEquals(looked, actual);
        if (!actual.contains(looked)) {
            Assertions.fail(String.format("search result should contain: %s, but was: %s", looked, actual));
        }

    }

}
