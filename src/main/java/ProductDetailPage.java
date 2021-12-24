import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToBasketButtonLocator = By.id("addBasket");
    By selectSizeLocator = By.cssSelector("#sizes > div > span:nth-child(2)");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToBasketButtonLocator);
    }

    public void addToCart() {
        click(selectSizeLocator);
        click(addToBasketButtonLocator);
    }
}
