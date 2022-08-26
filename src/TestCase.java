import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase {
    // Validate that an order can be completed

    public static void main(String[] args)  {


        WebDriver driver= Driver.getDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username =driver.findElement(By.id("user-name"));

        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginButton.click();

       WebElement bikeLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
       bikeLight.click();

       WebElement shoppingCartContainer = driver.findElement(By.id("shopping_cart_container"));
       shoppingCartContainer.click();

       WebElement checkoutButton = driver.findElement(By.id("checkout"));
       checkoutButton.click();

       WebElement firstName = driver.findElement(By.id("first-name"));
       firstName.sendKeys("Test");
       WebElement lastName = driver.findElement(By.id("last-name"));
       lastName.sendKeys("Tester");
       WebElement zipCode = driver.findElement(By.id("postal-code"));
       zipCode.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        WebElement checkoutCompleteMessage = driver.findElement(By.cssSelector("div[class=\"header_secondary_container\"]"));

        WebElement checkoutCompleteContainer = driver.findElement(By.id("checkout_complete_container"));

        WebElement header = driver.findElement(By.className("complete-header"));

       // Validating success screen
        System.out.println(driver.getCurrentUrl().equals
                ("https://www.saucedemo.com/checkout-complete.html")?"Validating success screen PASSED":"Validating success screen FAILED");

        // Validating the "Thank you for your order" message
        System.out.println(header.getText().equals("THANK YOU FOR YOUR ORDER")? "Test PASSED": "Test FAILED");

        // Validating if checkout container is present
        System.out.println(checkoutCompleteContainer.isDisplayed()?"Validating checkout container PASSED":"Validating checkout container FAILED");


        Driver.quitDriver();
    }
}
