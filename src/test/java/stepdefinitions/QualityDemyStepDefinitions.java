package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.QualitydemyPage;

public class QualityDemyStepDefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("ilk login linkine click yapar")
    public void ilk_login_linkine_click_yapar() {
        qualitydemyPage.loginLinkElementi.click();
    }
    @Then("user email olarak {string} girer")
    public void user_email_olarak_girer(String email) {
        qualitydemyPage.emailKutusu.sendKeys(email);
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qualitydemyPage.passwordKutusu.sendKeys(password);
    }
    @When("login butonuna click yapar")
    public void login_butonuna_click_yapar() {
        qualitydemyPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
    }
}
