package Pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserManager;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@class=\"_3704LK\"]")
    @Getter
    WebElement searchBox;


    @FindBy(xpath = "//span[@class=\"_10Ermr\"]/span")
    @Getter
    WebElement
    SearchResult;

    @FindBy(xpath = "//a[@class=\"YfzaL8\"]")

    @Getter
    WebElement incorrectInput;

    @FindBy(xpath = "//div[@class=\"_3uTeW4\"]")

    @Getter
    WebElement  specialCharacter;

    @FindBy(xpath = "//span[@class=\"_10Ermr\"]/span")

    @Getter
    WebElement multipleKeywords;

    @FindBy(xpath = "(//span[@class=\"_10Ermr\"])/span")

    @Getter
    WebElement products;
}
