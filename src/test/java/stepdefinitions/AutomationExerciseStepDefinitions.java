package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String emailAdress;
    String firstName;

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationExercisePage.signUpLoginLinki.click();
    }
    @Given("user Create an account bolumune name ve email adresi girer")
    public void user_create_an_account_bolumune_name_ve_email_adresi_girer() {

        firstName = faker.name().firstName();
        automationExercisePage.signUpnameTextbox.sendKeys(firstName);
        emailAdress = faker.internet().emailAddress();
        automationExercisePage.signUpemailTextbox.sendKeys(emailAdress);

    }

    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        automationExercisePage.signUpButon.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

        actions = new Actions(Driver.getDriver());
        actions.click(automationExercisePage.mrsButon) // mrs
                .sendKeys(Keys.TAB) // name
                .sendKeys(Keys.TAB)  // email
                .sendKeys(faker.internet().password()) // password
                .sendKeys(Keys.TAB)  // day
                .sendKeys("20")
                .sendKeys(Keys.TAB)
                .sendKeys("june")
                .sendKeys(Keys.TAB)
                .sendKeys("1999").perform();
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().secondaryAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("new")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();
    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
        actions.click(automationExercisePage.createAccountButon);
    }
    @Then("hesap olustugunu test eder")
    public void hesap_olustugunu_test_eder() {
        Assert.assertTrue(automationExercisePage.accountCreatedText.isDisplayed());
    }

    @Given("Login to your account bolumunde email kutusuna @ isareti olmayan email adresi yazar")
    public void login_to_your_account_bolumunde_email_kutusuna_isareti_olmayan_email_adresi_yazar() {
        automationExercisePage.loginEmailTextbox.sendKeys("ByeByeWorld");

    }
    @Given("password kutusuna sifre yazar ve enter'a tiklar")
    public void password_kutusuna_sifre_yazar_ve_enter_a_tiklar() {
        automationExercisePage.loginPasswordTextbox.sendKeys("SeeYouSoon"+Keys.ENTER);
    }
    @Then("sisteme giris yapilamadigini test eder")
    public void sistemeGirisYapilamadiginiTestEder() {
        Assert.assertTrue(automationExercisePage.loginPasswordTextbox.isEnabled());
    }
}
