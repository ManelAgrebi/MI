package Helper;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver;
	public static Actions action;
	
	public static void ConfChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", Utils.getProperty("TestDriverPath"));	
		driver=new ChromeDriver();
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void navigateURL(String url) {
		driver.get(url);
	}
	public static void quit() {
		driver.quit();
	}
}
