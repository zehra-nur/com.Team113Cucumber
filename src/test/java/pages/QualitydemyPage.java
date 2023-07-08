package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginLinkElementi;

    @FindBy(xpath = "(//*[@id='login-email'])[1]")
    public WebElement emailKutusu;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[text()='My courses']")
    public WebElement basariliGirisKontrolElementi;
}
