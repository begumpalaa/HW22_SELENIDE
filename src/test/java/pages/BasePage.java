package pages;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import utils.PropertyManager;
public class BasePage {
    protected String pageUrl;
    PropertyManager propertyManager = new PropertyManager();

    public BasePage() {
        this.pageUrl = pageUrl;
    }



    public void open() {
        String url = propertyManager.getProperty("APP_URL") ;
        Selenide.open(url);
    }

    public String getUrl(){
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
