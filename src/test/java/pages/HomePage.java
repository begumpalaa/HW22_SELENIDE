package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {




    public static SelenideElement btnButtons = $x("//span[text()='Buttons']");;
    public static SelenideElement clickMeButton = $x("//button[starts-with(., 'Click Me')]");
    public static SelenideElement txtDynamicClickMessage = $("#dynamicClickMessage");
    public static SelenideElement btnAddNewRecord = $("#addNewRecordButton");
    public static SelenideElement inputFirstName = $("#firstName");
    public static SelenideElement inputLastName = $("#lastName");
    public static SelenideElement inputEmail = $("#userEmail");
    public static SelenideElement inputAge = $("#age");
    public static SelenideElement inputSalary = $("#salary");
    public static SelenideElement inputDepartment = $("#department");
    public static SelenideElement btnSubmit = $("#submit");
    public static SelenideElement inputSearchBox = $("#searchBox");
    public static SelenideElement btnEditRecord = $("span[title='Edit']");
    public static SelenideElement editName = $x("//input[@id='firstName']");
    public static SelenideElement editLastname = $x("//input[@id='lastName']");
    public static SelenideElement editAge = $x("//input[@id='age']");

    public static SelenideElement editSalary = $x("//input[@id='salary']");

    public static SelenideElement submitButtonEdt = $x("//button[@id='submit']");


    public HomePage() {
        super();
    }
}


