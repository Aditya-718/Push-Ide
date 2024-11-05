package Pom_Script_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Script_Cl1 {
	@FindBy(id="email")
	private WebElement uName12;
	@FindBy(name="pass")
	private WebElement Pass12;
	@FindBy(name="login")
	private WebElement Sub12;
	public  Pom_Script_Cl1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void data_Uname12(String un)
	{
		uName12.sendKeys(un);
	}
	public void data_Password12(String pwd)
	{
		Pass12.sendKeys(pwd);
	}
	public void data_Click12()
	{
		Sub12.click();
	}

}
