import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Locate the username and password fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        // Enter credentials
        usernameField.sendKeys("yourUsername");
        passwordField.sendKeys("yourPassword");

        // Click the sign-in button
        WebElement signInButton = driver.findElement(By.id("signInBtn"));
        signInButton.click();

        // Print a success message
        System.out.println("Login test completed successfully!");

        // Navigate to the product page
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Locate and select the iPhone X product
        WebElement product = driver.findElement(By.xpath("//h4[contains(text(),'iphone X')]/following-sibling::button"));
        product.click();

        // Print a success message
        System.out.println("iPhone X added to cart successfully!");

        // Navigate to the cart page
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        // Verify if the product is in the cart
        WebElement cartProduct = driver.findElement(By.xpath("//h4[contains(text(),'iphone X')]"));
        if (cartProduct.isDisplayed()) {
            System.out.println("Product successfully added to the cart!");
        } else {
            System.out.println("Product not found in the cart.");
        }

        // Close the browser
        driver.quit();
    }
}