package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
WebDriver driver;
	
	public void LoginMethod() throws InterruptedException {
		
		iniatingloginpage();
		enteringcredentials();
		 logout();
		
	}
	public void iniatingloginpage() {
		System.out.println("***************************Started***************************************");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\divya.a.murugesan\\Documents\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		System.out.println("iniatingloginpage");
		
	}
	public void enteringcredentials() throws InterruptedException {
		
		driver.findElement(By.id("usernameField")).sendKeys("mdivya290997@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("#Diya2909#");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		System.out.println("enteringcredentials");
	}
	public void logout() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[text()='My Naukri']/parent::a"))).perform();;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		System.out.println("logout");
		driver.close();
		System.out.println("*****************************Completed***************************");
		
	}
	
}
