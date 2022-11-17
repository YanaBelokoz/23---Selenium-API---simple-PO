package PO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllLaptop extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(AllLaptop.class);

    @FindBy(xpath = "//select")
    private WebElement sortingDropdownMenu;

    @FindBy(xpath = "//select/option[@value='2: expensive']")
    private WebElement selectFormHighToLowPriceInSortingDropdownMenu;

    @FindBy(xpath = "//a[@data-id='Rozetka']")
    private WebElement sellerRozetkaCheckBox;

    @FindBy(xpath ="//a[@class='checkbox-filter__link' and @ data-id='HP']")
    private WebElement checkBoxHP;

    @FindBy(xpath = "//a[@class='goods-tile__heading ng-star-inserted'][1]")
    private WebElement firstLaptopOnThePageHp;

    public AllLaptop selectFromHighToLowPriceInSortingDropdownMenu() {
        LOGGER.info("Select 'From High to Lower price' in sorting dropdown menu");
        selectFormHighToLowPriceInSortingDropdownMenu.click();
        return this;
    }

    public AllLaptop chooseSellerRozetka() {
        LOGGER.info("Choose seller 'Rozetka' in left side on sorting menu");
        sellerRozetkaCheckBox.click();
        return this;
    }

    public AllLaptop chooseCheckBoxHP() {
        LOGGER.info("Choose brand 'HP' in left side on sorting menu");
        checkBoxHP.click();
        return this;
    }

    public LaptopHP chooseFirstProduct() {
        LOGGER.info("Choose the first laptop on page after sorting");
        firstLaptopOnThePageHp.click();
        return new LaptopHP();
    }

    public void clickOnSortingDropdownMenu() {
    }
}
