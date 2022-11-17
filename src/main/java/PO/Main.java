package PO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    @FindBy(xpath = "//input")
    private WebElement searchBar;

    @FindBy(xpath = "//button[contains(text(), 'Find')]")
    private final WebElement searchButton;

    public Main(WebElement searchBar, WebElement searchButton) {
        this.searchBar = searchBar;
        this.searchButton = searchButton;
    }

    public Main clickOnSearchBar() {
      LOGGER.info("Click SearchBar);
      searchBar.click();
      return this;
    }

    public Main clearSearchBar() {
        LOGGER.info("Clear SearchBar");
        searchBar.clear();
        return this;
    }

    public Main inputQueryToSearchBar(String text) {
        LOGGER.info("Send query'" + text + "' to searchBar);
        searchBar.sendKeys(text);
        return this;
    }

    public Main pushSearchButton() {
        LOGGER.info("Click on search button and go to AllLaptop");
        searchButton.click();
        return this;
    }

}
