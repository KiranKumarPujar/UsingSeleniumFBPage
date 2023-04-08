package fbloginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");

		int count = 0;

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.id("email")).sendKeys("ksdlkssdaaaaa");
			driver.findElement(By.id("pass")).sendKeys("asasdss");
			driver.findElement(By.name("login")).click();
			count++;
		}

		if (count == 3) {
			System.out.println("You have Exhausted the Login attempt");
		}
	}
}
