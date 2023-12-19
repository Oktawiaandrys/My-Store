package pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreNewAddressPage {
    private WebDriver driver;

    @FindBy(id = "field-alias")
    private WebElement newAliasWritten;

    @FindBy(id = "field-address1")
    private WebElement newAddressField;

    @FindBy(id = "field-city")
    private WebElement newCityField;

    @FindBy(id = "field-postcode")
    private WebElement newPostCodeField;
    @FindBy(id = "field-phone")
    private WebElement newPhoneFiled;

    @FindBy(css = "#content > div > div > form > footer > button")
    private WebElement saveButton;


    public MyStoreNewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void newAliasWritten(String alias){newAliasWritten.sendKeys(alias);}

    public void newAddressField(String address){newAddressField.sendKeys(address);}

    public void newCityField(String city){newCityField.sendKeys(city);}

    public void newPostCodeField(String zipcode){newPostCodeField.sendKeys(zipcode);}
    public void setNewPhoneFiled(String phone){newPhoneFiled.sendKeys(phone);}

    public void saveButton(){saveButton.click();}
}

