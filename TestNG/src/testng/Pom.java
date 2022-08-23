package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(xpath="//input[@id='email']")
	private WebElement ele1;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement ele2;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement ele3;
	
public Pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void getBtn()
{
	ele1.sendKeys("pyprattu@gmail.com");
	ele2.sendKeys("smiley_1990");
	ele3.click();
}
}
