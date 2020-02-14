package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class onlinecat {

	WebDriver driver;
	@FindBy(xpath="//tr//td[text() = '1004']/following-sibling::td//h1//input[@type ='text']")
	WebElement txtquan;
	
	@FindBy(name="bSubmit")
	WebElement btnPlaceorder;
	
	//constructor
	public onlinecat(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void Onlinecatalog(String Itemnum){
		txtquan.sendKeys(Itemnum);
	}
	
	
}
