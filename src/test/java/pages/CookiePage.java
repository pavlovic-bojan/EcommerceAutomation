package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiePage extends BasePage {

    public CookiePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='cookiescript_close')]")
    WebElement xClickCookie;

    public void clickXCookie() throws Exception {
        click(xClickCookie, "Button X" + xClickCookie + " has been clicked!");
    }

}
