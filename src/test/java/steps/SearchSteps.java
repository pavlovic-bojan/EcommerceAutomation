package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Reporter;
import pages.CookiePage;
import pages.SearchPage;
import tests.BaseTest;

public class SearchSteps extends BaseTest {
    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
    String wait = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("wait");
    String quit = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("quit");
    String env = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("env");

    @Before
    public void setup() throws Exception {
        init(browser, wait);
    }

    @After
    public void tearDown() {
        if (quit.equalsIgnoreCase("Yes")) {
            quit();
        }
    }


    @Given("I am on the web shop extremeintimo")
    public void iAmOnTheWebShopExtremeintimo() throws Exception {
        openApp(env);
        new CookiePage(driver).clickXCookie();
    }

    @When("I enter my search query {string}")
    public void iEnterMySearchQuery(String search) throws Exception {
        new SearchPage(driver).enterSearchQuery(search);
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() throws Exception {
        new SearchPage(driver).clickSearch();
    }

    @Then("Verify that the search results are displayed")
    public void iShouldBeLoggedIn() {
        new SearchPage(driver).searchResultsShouldBeVisible();
    }


}
