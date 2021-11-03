import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import data.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import common.*;
public class UIAutomation {
	
			@BeforeMethod
		    public void beforeMethod()
		    {
				common.openbrowser();
		    }
			@AfterMethod
		    public void afterMethod()
		    {
				common.closebrowser();
		    }
			
			@Test
		    public void InvalidLogin() throws InterruptedException {
			// TODO Auto-generated method stub
			UIIcon.btnSignIn().click();
			UIIcon.typeEmail().sendKeys(data.email);
			UIIcon.btnSubmit().click();
			common.driver.get(common.mailinatorurl);
			UIIcon.openEmail().click();
			UIIcon.tabText().click();
			common.driver.switchTo().frame(common.driver.findElement(By.id("texthtml_msg_body")));
			UIIcon.qaLink().click();
			
		    ArrayList<String> tabs = new ArrayList<String>(common.driver.getWindowHandles());
			System.out.println(tabs.size());
			//Use the list of window handles to switch between windows
			common.driver.switchTo().window(tabs.get(1));
		
			System.out.print(common.driver.getTitle());
			common.driver.findElement(By.xpath("//button[contains(text(),'Pay £20/mo')]")).click();
			UIIcon.cardNumber().sendKeys(data.validCard);
			UIIcon.cardExpiry().sendKeys(data.expiry);
			UIIcon.cardCVC().sendKeys(data.cvv);
		    UIIcon.billingName().sendKeys(data.billingName);
		    UIIcon.btnSubmitForm().click();
		    common.driver.switchTo().frame(common.driver.findElement(By.xpath("/html/body/div/iframe")));
		    UIIcon.btn3Dauth().click();
		    assertTrue(common.driver.findElement(By.xpath("//span[contains(text(),'Your card has been declined.')]")).isDisplayed());
		}
	
	    @Test
	    public void validLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		common.driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		common.driver.findElement(By.id("email")).sendKeys(data.email);
		common.driver.findElement(By.xpath("//button[@type='submit']")).click();
		common.driver.get(common.mailinatorurl);
		common.driver.findElement(By.xpath("//tr[1]/td[contains(text(),' qa-challenge@pego.dev')]")).click();
		common.driver.findElement(By.xpath("//a[contains(text(),'TEXT')]")).click();
		common.driver.switchTo().frame(common.driver.findElement(By.id("texthtml_msg_body")));
		common.driver.findElement(By.xpath("//a[contains(@href,'qa-cha')]")).click();
		
	    ArrayList<String> tabs = new ArrayList<String>(common.driver.getWindowHandles());
		System.out.println(tabs.size());
		//Use the list of window handles to switch between windows
		common.driver.switchTo().window(tabs.get(1));

		System.out.print(common.driver.getTitle());
		common.driver.findElement(By.xpath("//button[contains(text(),'Pay £20/mo')]")).click();
		UIIcon.cardNumber().sendKeys(data.invalidCard);
		UIIcon.cardExpiry().sendKeys(data.expiry);
		UIIcon.cardCVC().sendKeys(data.cvv);
	    UIIcon.billingName().sendKeys(data.billingName);
	    UIIcon.btnSubmitForm().click();
        common.driver.findElement(By.id("//form/button[@id='test-source-authorize-3ds']")).click();   
	}	    
}