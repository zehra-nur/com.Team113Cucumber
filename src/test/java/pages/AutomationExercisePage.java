package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLoginLinki;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement signUpnameTextbox;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement signUpemailTextbox;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signUpButon;

    @FindBy(xpath = "//*[@id='id_gender2']")
    public WebElement mrsButon;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccountButon;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedText;
}
