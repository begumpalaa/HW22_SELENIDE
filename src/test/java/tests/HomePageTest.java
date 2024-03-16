package tests;

import com.codeborne.selenide.Selenide;
import common.TestContext;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class HomePageTest extends BaseTest {

    @Test
    public void testButtonClick() {

       // HomePage.btnButtons.shouldBe(visible).click();
      //  Duration.ofSeconds(10);
        //  HomePage.clickMeButton.click();
        //  HomePage.txtDynamicClickMessage.shouldBe(visible).getText();
        //  assertEquals("You have done a dynamic click", "You have done a dynamic click");

        Selenide.open("https://demoqa.com/webtables");

        HomePage.inputFirstName.setValue("Begum");
        HomePage.inputLastName.setValue("Pala");
        HomePage.inputEmail.setValue("test@hot.com");
        HomePage.inputAge.setValue("24");
        HomePage.inputSalary.setValue("1500");
        HomePage.inputDepartment.setValue("arge");
        HomePage. btnSubmit.click();
        HomePage.inputSearchBox.setValue("Begum");
        HomePage.btnEditRecord.click();
        HomePage.editName.setValue(" Edit");
        HomePage.editLastname.setValue(" Edit");
        HomePage.editAge.setValue("");
        HomePage.editAge.setValue("2");
        HomePage.editSalary.setValue("");
        HomePage.editSalary.setValue("23");
        HomePage.submitButtonEdt.click();

    }
    public void begumIsminiKontrolEt() {


        boolean isBegumPresent = $$("div.rt-table > div.rt-tbody .rt-tr-group")
                .findBy(text("Begum")).exists();

        assertTrue(isBegumPresent, "\"Begum\" ismi tabloda bulunamadı.");
    }
}
