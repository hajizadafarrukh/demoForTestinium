import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ControlPage extends BasePage{



    public ControlPage(WebDriver driver) {
        super(driver);
    }

    By accountLocator = By.xpath("/html/body/header/div/div/div[3]/div/a[1]/span");

    public void controlPage(){
        click(accountLocator);
    }

    public void control() {
        click(accountLocator);

    }

    public Boolean isOnControlPage(){
        return isDisplayed(accountLocator);
    }
}
