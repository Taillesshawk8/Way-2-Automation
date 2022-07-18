package Applications.bankingapplication;

import Applications.bankingapplication.pages.*;
import org.openqa.selenium.WebDriver;

public class BankingApplication {

    public LoginPage loginPage;
    public ValidationPage validationPage;
    public AccountPage accountPage;

    public BankingApplication(WebDriver driver){
        loginPage = new LoginPage(driver);
        validationPage = new ValidationPage(driver);
        accountPage = new AccountPage(driver);
    }
}
