package Applications.bankingapplication.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCustomerLogin(){
        clickLink("//button[text()=\"Customer Login\"]");
    }

    private void clickLink(String linkText){
        driver.findElement(By.xpath(linkText)).click();
    }
}
