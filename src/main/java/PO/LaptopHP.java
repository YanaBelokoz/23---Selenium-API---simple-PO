package PO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopHP extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(LaptopHP.class);

    @FindBy(xpath = "span[@class='buy-button__label ng-star-inserted']")
    private WebElement buyButton;

    @FindBy(xpath = "//a[@data-testid='cart-receipt-submit-order']")
    private WebElement toOrderButtonOnAlertWindow;

    public static LaptopHP clickOnByButton() {
        LOGGER.info("Click on 'Buy' button");
        buyButton.click();
        return this;
    }

    public static LaptopHP clickOnToOrderButtonInAlertWindow() {
        LOGGER.info("Click on 'Order' button");
        toOrderButtonOnAlertWindow.click();
        return this;
    }
}
