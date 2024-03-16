package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.webdriver.Url;
import common.PageManager;
import driver.DriverFactory;
import io.cucumber.java.en.Given;
import tests.BaseTest;

public class LoginSteps extends BaseTest {

    @Given("Open the Web Site {string}")
    public void openTheWebSite(String url) {
        DriverFactory.initDriver(); // Tarayıcı ayarlarını yapılandır
        DriverFactory.open(url);
        }
}

