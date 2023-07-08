package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HerokuappStepDefinitions {

    HerokuPage herokuPage = new HerokuPage();

    @Then("{string} butonuna basar")
    public void butonuna_basar(String string) {
        herokuPage.addElementButonu.click();
    }

    @Then("{string} butonu gorunur oluncaya kadar bekleyin")
    public void butonu_gorunur_oluncaya_kadar_bekleyin(String string) {
        // Delete butonu implicitly wait suresi icinde gorunur oldugundan bu adimda bir islem yapilmadi
    }

    @Then("“Delete” butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu silin")
    public void delete_butonuna_basarak_butonu_silin() {
        herokuPage.deleteButonu.click();
    }

    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {
        try {
            Assert.assertTrue(herokuPage.deleteButonu.isDisplayed());
        } catch (NoSuchElementException e) {

            Assert.assertTrue(true);
        }
    }

}
