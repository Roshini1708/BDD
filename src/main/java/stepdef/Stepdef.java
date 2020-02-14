package stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screenshots.Screenshot;

public class Stepdef {
	WebDriver driver;
	//@FindBy(name = "bSubmit")
	//WebElement btnsubmit;
	
	//constructor 
	//Stepdef(){
		//PageFactory.initElements(driver, this.getClass()); //initializing page objects
	//}
	Screenshot s = new Screenshot();
	
	@Given ("^I Launch Borland url$")
	public void Launch() throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\seleniumjars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
		s.screen(driver);
	}
	
	@When ("^I verify page title \"(.*)\"$")
	public void Verify(String title){
		String s1 = driver.getTitle();
		System.out.println(s1);
		Assert.assertEquals(s1, title);
		}
	
	@Then ("^I Click on Enter GMO Online button$")
	public void Click(){
		driver.findElement(By.name("bSubmit")).click();
		//btnsubmit.click();
	}
	
	@Then ("^I Click on Place An Order button$")
	public void Click1() throws IOException{
		driver.findElement(By.name("bSubmit")).click();
		s.screen(driver);
	}
	

	@Then ("^I Enter Order Quantity for \"(.*)\" as \"(.*)\"$")
	public void Enter(String Itemnum, String Quantity) throws IOException{
		driver.findElement(By.xpath("//tr//td[text() = '"+Itemnum+"']/following-sibling::td//h1//input[@type ='text']")).sendKeys(Quantity);
		s.screen(driver);
	}
	@When ("^I Click on About The GMO Site button$")
	public void Click2(){
		driver.findElement(By.name("bAbout")).click();

	}
	

}
