import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest {

	WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("fshimu.2104@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Fatematujjohora");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("shimu");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("fatema");
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		seleniumtest obj = new seleniumtest();
		obj.launchBrowser();
	}

}
