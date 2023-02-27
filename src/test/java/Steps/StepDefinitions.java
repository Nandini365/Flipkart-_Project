package Steps;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BrowserManager;
import utils.QAProps;
import utils.TestDataReader;

import java.util.HashMap;

public class StepDefinitions {
    public WebDriver driver;
    String url;
    HomePage homePage;
    HashMap<String,String> data;
    Scenario scenario;

    public  StepDefinitions(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }
    @Before(order = 1)
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }
    @Given("The use is on the Flipkart website and the search bar is visible.")
    public void theUseIsOnTheFlipkartWebsiteAndTheSearchBarIsVisible() {
        url = QAProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("The user enters a valid product name in the search bar and hits enter key.")
    public void the_user_enters_a_valid_product_name_in_the_search_bar_and_hits_enter_key() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("Input"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
    }
    @Then("the search results page should display all the relevant products related to the entered product name.")
    public void the_search_results_page_should_display_all_the_relevant_products_related_to_the_entered_product_name() {
        String text = homePage.getSearchResult().getText();
        System.out.println(text);
        Assert.assertEquals(text,data.get("Input"));

    }
    //
    @Given("The user is on the Flipkart website.")
    public void theUserIsOnTheFlipkartWebsite() {
        url = QAProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());

    }
    @When("The user enters an invalid product name in the search bar and hits the enter key.")
    public void the_user_enters_an_invalid_product_name_in_the_search_bar_and_hits_the_enter_key() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("Input"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);


    }
    @Then("The search results page should display all relevant products.")
    public void the_search_results_page_should_display_all_relevant_products() {
        String text = homePage.getIncorrectInput().getText();
        System.out.println(text);
        Assert.assertEquals(text,data.get("Input"));
    }


    //
    @Given("The user is on the Flipkart website and search bar is visible.")
    public void theUserIsOnTheFlipkartWebsiteAndSearchBarIsVisible() {
        url = QAProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());


    }


    @When("The user enters a product name with special characters in the search bar and hits the enter key.")
    public void the_user_enters_a_product_name_with_special_characters_in_the_search_bar_and_hits_the_enter_key() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("Input"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);

    }
    @Then("The search results page should display all the relevant products related to the entered product name, including special characters.")
    public void the_search_results_page_should_display_all_the_relevant_products_related_to_the_entered_product_name_including_special_characters() {
        String text = homePage.getSpecialCharacter().getText();
        System.out.println(text);
        Assert.assertEquals(text,"Sorry, no results found!");

    }
    //
    @Given("The user is on the Flipkart website and it visible the searchbar.")
    public void theUserIsOnTheFlipkartWebsiteAndItVisibleTheSearchbar() {
        url = QAProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());

    }
    @When("The user enters multiple keywords in the search bar, separated by space, and hits the enter key.")
    public void the_user_enters_multiple_keywords_in_the_search_bar_separated_by_space_and_hits_the_enter_key() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("Input"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);


    }
    @Then("The search results page should display all the relevant products related to the entered keywords.")
    public void the_search_results_page_should_display_all_the_relevant_products_related_to_the_entered_keywords() {
        String text = homePage.getMultipleKeywords().getText();
        System.out.println(text);
        Assert.assertEquals(text,data.get("Input"));

    }
    //




    @Given("The user is navigated to flipkart website")
    public void theUserIsNavigatedToFlipkartWebsite() {
        url = QAProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());

    }

    @When("the user enters {string} in the search bar")
    public void theUserEntersInTheSearchBar(String arg0) {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(arg0);
        homePage.getSearchBox().sendKeys(Keys.ENTER);

    }
    @Then("the search bar should display all the related results {string}")
    public void theSearchBarShouldDisplayAllTheRelatedResults(String arg0) {
        String text = homePage.getProducts().getText();
        System.out.println(text);
        Assert.assertTrue(text.contains(arg0));
        // Assert.assertEquals(text,"\"samsung mobiles\"");
    }





    @Given("user is able to access the search bar")
    public void userIsAbleToAccessTheSearchBar() {
        System.out.println("user is able to access the search bar");
    }



}



