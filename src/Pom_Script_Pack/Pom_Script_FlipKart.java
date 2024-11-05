package Pom_Script_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script_Pom.BasePage;

public class Pom_Script_FlipKart extends BasePage {
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")
	private WebElement  sch;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement schic;
	@FindBy(xpath="//div[@class='KzDlHZ']")
	private WebElement clc;
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement clc1;
	@FindBy(xpath="//button[text()='Buy Now']")
	private WebElement cli;
	
	public Pom_Script_FlipKart(WebDriver driver)
	{
		super(driver);
	}
	public void DataSend(String ph)
	{
		sch.sendKeys(ph);
	}
	public void ClickData()
	{
		schic.click();
	}
	public void PhoneSam()
	{
		clc.click();
	}
	public void AddCart()
	{
		clc1.click();
	}
	public void BuyNow()
	{
		cli.click();
	}

}
