package org.project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccount {
	
	WebDriver driver;
	@BeforeClass
	private void tc01() {
		driver =new ChromeDriver();
		driver.get("https://automationexercise.com/login");

	}
	@Test
	private void tc02() {
		driver.
		findElement(By.name("name")).sendKeys("Abcde");
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("mewisi9272@notedns.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("Abc@123");
		WebElement day = driver.findElement(By.id("days"));
		Select select1=new Select(day);
		select1.selectByValue("2");
		WebElement month = driver.findElement(By.id("months"));
		Select select2=new Select(month);
		select2.selectByValue("3");
		WebElement year = driver.findElement(By.id("years"));
		Select select3=new Select(year);
		select3.selectByValue("2000");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("first_name")).sendKeys("Abcde");
		driver.findElement(By.id("last_name")).sendKeys("fghij");
		driver.findElement(By.id("company")).sendKeys("Zoho");
		driver.findElement(By.id("address1")).sendKeys(" 39/ B, Suren Rd, Andheri (west),Kerala,7107");
		driver.findElement(By.id("address2")).sendKeys(" 39/ B, Suren Rd, Andheri (west),Kerala,7107");
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select select4=new Select(country);
		select4.selectByValue("India");
		driver.findElement(By.id("state")).sendKeys("kerala");
		driver.findElement(By.id("state")).sendKeys("kerala");
		driver.findElement(By.id("city")).sendKeys("Thiruvananthapuram");
		driver.findElement(By.id("zipcode")).sendKeys("123456");
		driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		WebElement text = driver.findElement(By.xpath("//b[text()='Account Created!']"));
		String text2 = text.getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("(//a[@style='color: brown;'])[27]")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[contains (text(),'Continue Shopping')]")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Perfect");
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		driver.findElement(By.name("name_on_card")).sendKeys("Abcde");
		driver.findElement(By.name("card_number")).sendKeys("1584577336587");
		driver.findElement(By.name("cvc")).sendKeys("311");
		driver.findElement(By.name("expiry_month")).sendKeys("03");
		driver.findElement(By.name("expiry_year")).sendKeys("2050");
		driver.findElement(By.id("submit")).click();
		WebElement order = driver.findElement(By.xpath("//b[text()='Order Placed!']"));
		String text3 = order.getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("(//a[@style='color:brown;'])[2]")).click();
		WebElement delete = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
		String text4 = delete.getText();
		System.out.println(text4);
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
	}
	@AfterClass
	private void tc03() {
//		driver.quit();

	}
	

}
