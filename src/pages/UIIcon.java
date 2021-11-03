package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import common.*;

public class UIIcon {
	
	public static WebElement btnSignIn()
	{
		return common.driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
	}
	public static WebElement typeEmail()
	{
		return common.driver.findElement(By.id("email"));
	}
	public static WebElement btnSubmit()
	{
		return common.driver.findElement(By.xpath("//button[@type='submit']"));
	}
	public static WebElement openEmail()
	{
		return common.driver.findElement(By.xpath("//tr[1]/td[contains(text(),' qa-challenge@pego.dev')]"));
	}
	public static WebElement tabText()
	{
		return common.driver.findElement(By.xpath("//a[contains(text(),'TEXT')]"));
	}
	public static WebElement qaLink()
	{
		return common.driver.findElement(By.xpath("//a[contains(@href,'qa-cha')]"));
	}
	public static WebElement cardNumber()
	{
		return common.driver.findElement(By.id("cardNumber"));
	}
	public static WebElement cardExpiry()
	{
		return common.driver.findElement(By.id("cardExpiry"));
	}
	public static WebElement cardCVC()
	{
		return common.driver.findElement(By.id("cardCvc"));
	}
	public static WebElement billingName()
	{
		return common.driver.findElement(By.id("billingName"));
	}
	public static WebElement btnSubmitForm()
	{
		return common.driver.findElement(By.xpath("//form//div[@class='SubmitButton-IconContainer']"));
	}
	public static WebElement btn3Dauth()
	{
		return common.driver.findElement(By.xpath("//button[@id='test-source-authorize-3ds']"));
	}
}