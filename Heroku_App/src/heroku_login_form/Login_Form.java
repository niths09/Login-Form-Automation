package heroku_login_form;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Form {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/login");
        
        WebElement userName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
        userName.click();
        userName.sendKeys("tomsmith");
        waitForTheUser();
        
        WebElement passWord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
        passWord.click();
        passWord.sendKeys("SuperSecretPassword!");
        waitForTheUser();
        
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginButton.click();
        waitForTheUser();
        
        WebElement loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flash success']")));
        System.out.println("Login Message: " + loginMessage.getText());
        waitForTheUser();
        
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icon-2x icon-signout']")));
        logoutButton.click();
        waitForTheUser();
        
        WebElement logoutMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flash success']")));
        System.out.println("Logout Message: " + logoutMessage.getText());
        waitForTheUser();
        
        driver.close();
	}
	
	public static void waitForTheUser() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
