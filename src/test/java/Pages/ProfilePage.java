package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

    WebDriver driver;
    WebElement loggedinMessage;
    WebElement logOutButton;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLoggedinMessage() {
        return driver.findElement(By.className("post-title"));
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.linkText("Log out"));
    }

    //-----------------

    public void clickOnLogoutButton() {
        getLogOutButton().click();
    }
}
