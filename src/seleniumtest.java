import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest {

	WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mithun\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		seleniumtest obj = new seleniumtest();
		obj.launchBrowser();
	}

}
