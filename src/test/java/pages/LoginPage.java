package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 3), this);
    }

    @FindBy(xpath = "//span[contains(text(), \"Sign in\")]")
    WebElement signInButton;

    @FindBy(xpath = "//input")
    WebElement emailInputField;


}
