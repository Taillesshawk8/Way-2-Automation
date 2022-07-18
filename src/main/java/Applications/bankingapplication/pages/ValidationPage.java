package Applications.bankingapplication.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class ValidationPage {

    private final WebDriver driver;
    private final By dropdown = By.id("userSelect");

    public ValidationPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getDropdownOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public void clickLoginButton(){
        driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();

    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
