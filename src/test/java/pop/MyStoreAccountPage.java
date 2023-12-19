package pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAccountPage {
    private WebDriver driver;

    @FindBy(id = "addresses-link")
    private WebElement addressField;

    public MyStoreAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickAddress() {
        addressField.click();
    }

}

