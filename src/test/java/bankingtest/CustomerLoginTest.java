package bankingtest;

import basetest.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerLoginTest extends BaseTest {

    @Test
    public void depositTest(){
        String user = "Hermoine Granger";
        String amountToDeposit = "500"; // in dollars
        app.loginPage.clickCustomerLogin();
        app.validationPage.selectFromDropDown(user);
        app.validationPage.clickLoginButton();
        app.accountPage.deposit(amountToDeposit);
        assertTrue(app.accountPage.getConfirmation().isDisplayed());
    }
}
