import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage{
    By cartCountLocator = By.className("o-header__userInfo--count");

    SearchBox searchBox;

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount()==2;
    }

    public void goToCart() {
        click(cartCountLocator);
    }

    private int getCartCount(){
       String count= find(cartCountLocator).getText();
       return Integer.parseInt(count);
    }
}
