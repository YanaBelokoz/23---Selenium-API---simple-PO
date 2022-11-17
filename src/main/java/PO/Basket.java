package PO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basket {
    private static final Logger LOGGER = LogManager.getLogger(Basket.class);

    @FindBy(xpath = "//dt[@class='checkout-total__label' and contains(text(), 'product']")
    private WebElement countProductsInBasket;

    @FindBy(xpath = "//dd[@class='checkout-total__value checkout-total__value_size_large']")
    private WebElement totalPriseProductInBasket;

    public String getCountProductsInBasket() {
        LOGGER.info("");
        return countProductsInBasket.getText();
    }

    public int getTotalPriceProductInBasket() {
        LOGGER.info("Getting total price from basket");
        return takeIntFromString(totalPriseProductInBasket.getText());
    }

    private int takeIntFromString(String str) {
        LOGGER.info("Method to take integer number from string");
        String str1 = str.replaceAll("\\s", "").replaceAll(".$", "");
        return Integer.parseInt(str1);
    }
}
