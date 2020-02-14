package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class entergmo {
	WebDriver driver;
	@FindBy(name="bSubmit")
	WebElement btnEnterGMO;
	
	//constructor
	public entergmo(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//method
	public void click_entergmo(){
		btnEnterGMO.click();
	}
	
}
