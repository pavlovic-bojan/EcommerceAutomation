package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchInput;

    @FindBy(css = "//button[@id='menu-search-icon']")
    WebElement searchButton;

    @FindBy(xpath = "//span[@class='base'][contains(text(),'Rezultati pretrage za:')]")
    WebElement searchResults;

    public void enterSearchQuery(String search) throws Exception {
        typeText(searchInput, search, "Search " + search + " has been typed into the field!");
    }

    public void clickSearch() throws Exception {
        click(searchButton, "Button " + searchButton + " has been clicked!");
    }
    public void searchResultsShouldBeVisible() {
        Assert.assertTrue(searchResults.isDisplayed());
    }

}
