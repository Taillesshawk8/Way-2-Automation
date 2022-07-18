package bankingtest;

import basetest.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerLoginTest extends BaseTest {

    @Test
    public void testCase1(){
        app.loginPage.clickCustomerLogin();
        String option = "Hermoine Granger";
        app.validationPage.selectFromDropDown(option);
        app.validationPage.clickLoginButton();
        app.accountPage.deposit("500");
        assertTrue(app.accountPage.getConfirmation().isDisplayed());
    }
}
