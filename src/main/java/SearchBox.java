import org.openqa.selenium.*;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.cssSelector("input.default-input.o-header__search--input");
    By submitButtonLocator = By.cssSelector("button.o-header__search--btn.bmi-search");
    By moreContentButtonLocator = By.xpath("/html/body/div[5]/div/div[1]/div[3]/div/div/button");


    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {




        /*
        -----clickle arama yapma-----

        type(searchBoxLocator, text);
        click(submitButtonLocator);

        */
        //----enter ile arama yapma
        WebElement element = driver.findElement(By.cssSelector("input.default-input.o-header__search--input"));
        element.sendKeys(text, Keys.ENTER);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        click(moreContentButtonLocator);


    }
}
