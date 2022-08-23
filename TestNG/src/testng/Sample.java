package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sample extends Generic
{
@Test
public void login()
{
	driver.findElement(By.id("Email address")).sendKeys("pyprattu@gmail.com");
	driver.findElement(By.name("password")).sendKeys("smiley_1990");
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
}
}