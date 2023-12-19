package MyStore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pop.*;

public class MyStoreSteps {
    private WebDriver driver;

    private MyStoreMainPage mainPage;
    private MyStoreLoginPage loginPage;
    private MyStoreAccountPage accountPage;
    private MyStoreAddressPage addressPage;
    private MyStoreNewAddressPage newAddressPage;


    @Given("Page {string} opened in browser")
    public void openPage(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        mainPage = new MyStoreMainPage(driver);
        loginPage = new MyStoreLoginPage(driver);
        accountPage = new MyStoreAccountPage(driver);
        addressPage = new MyStoreAddressPage(driver);
        newAddressPage = new MyStoreNewAddressPage(driver);
    }

    @When("Click sign in")
    public void clickSignIn() {
        mainPage.clickSignIn();
    }

    @When("Email entered in email box")
    public void setEmail() {
        loginPage.setEmailField();
    }

    @When("Password entered in password box")
    public void setPassword() {
        loginPage.setPasswordField();
    }

    @And("Sign in button clicked")
    public void clickSignIn2() {
        loginPage.clickSignIn2();
    }

    @And("Address clicked")
    public void clickAddressAccount() {
        accountPage.clickAddress();
    }

    @And("Create new address clicked")
    public void createNewAddressClicked() {
        addressPage.createNewAddress();
    }

    @And("New {string} Alias")
    public void newAlias(String Alias) {
        newAddressPage.newAliasWritten(Alias);
    }

    @And("Address {string} field fill")
    public void address(String Address) {
        newAddressPage.newAddressField(Address);
    }

    @And("City {string} field fill")
    public void city(String City) {
        newAddressPage.newCityField(City);
    }

    @And("ZipCode {string} field fill")
    public void zipcode(String Zipcode) {
        newAddressPage.newPostCodeField(Zipcode);
    }

    @And("Phone {string} field filled")
    public void phone(String Phone) {
        newAddressPage.setNewPhoneFiled(Phone);
    }

    @And("Click save button")
    public void saveButton() {
        newAddressPage.saveButton();
    }


    @Then("Check if address alias is equal {string}")
    public void checkIfAddressAliasIsEqualAlias(String al1iasTwo) {
        addressPage.checkAlias(al1iasTwo);
    }

    @Then("Check if address equals {string}")
    public void checkIfAddressEqualsAddress(String addressTwo) {
        addressPage.checkAddress(addressTwo);
    }

    @Then("Check if address city equal {string}")
    public void checkIfAddressCityEqualCity(String City) {
        addressPage.checkAddress(City);
    }

    @Then("Check if address zipCode equal {string}")
    public void checkIfAddressZipCodeEqualZipcode(String ZipCode) {
        addressPage.checkAddress(ZipCode);
    }

    @Then("Check if phone equals {string}")
    public void checkIfPhoneEqualsPhone(String Phone) {
        addressPage.checkAddress(Phone);
    }

    @Then("Delete address")
    public void deleteAddress() {addressPage.deleteAddressTwo();}

    @Then("Check if address deleted")
    public void checkIfAddressDeleted() {addressPage.notificationEquals();}

    @Then("Close the browser")
    public void closeTheBrowser() {this.driver.quit();System.out.println("Browser successfully closed!:)");}
}
