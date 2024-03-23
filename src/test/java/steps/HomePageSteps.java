package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import tests.BaseTest;
import tests.HomePageTest;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;



public class HomePageSteps extends BaseTest {

    private HomePageTest homePageTest;

    public HomePageSteps(HomePageTest homePageTest) {
        this.homePageTest = homePageTest;
    }


    @When("Click Button and Add Web Table")
    public void clickButtonAndAddWebTable() {
        homePageTest.testButtonClick();

    }


    @Then("The new entry with the name should be visible in the table")
    public void theNewEntryWithTheNameShouldBeVisibleInTheTable() {
            String expectedName = "Begum";
            boolean isNamePresent = $$("div.rt-table > div.rt-tbody .rt-tr-group")
                    .findBy(text(expectedName)).exists();

            if (!isNamePresent) {
                throw new AssertionError(expectedName + " ismi tabloda bulunamadı.");
            }
        }
}
