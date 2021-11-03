package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {
	
	public static WebDriver driver;
    public static String mailinatorurl = "https://www.mailinator.com/v4/public/inboxes.jsp?to=testselenium";
    public static String qachallenge = "https://qa-challenge-tabeo.vercel.app/";
    
    public static void openbrowser()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shrikant\\eclipse-workspace\\Test\\exe\\chromedriver.exe");
		common.driver = new ChromeDriver();
		common.driver.manage().window().maximize();
		common.driver.get(common.qachallenge);
    }
    
    public static void closebrowser()
    {
    	common.driver.quit();
    }
}
