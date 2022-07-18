package Applications.bankingapplication.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
    private final WebDriver driver;
    private final By DepositButton = By.xpath("//button[contains(text(), \"Deposit\")]");
    private final By AmountField = By.xpath("//input[@type=\"number\"]");
    private final By SubmitButton = By.xpath("//button[@type=\"submit\"]");
    private final By Confirmation = By.xpath("//span[text()=\"Deposit Successful\"]");

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }

    public void deposit(String amount){
        driver.findElement(DepositButton).click();
        driver.findElement(AmountField).sendKeys(amount);
        driver.findElement(SubmitButton).click();
    }

    public WebElement getConfirmation(){
        return driver.findElement(Confirmation);
    }
}
