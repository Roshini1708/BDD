package stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.entergmo;
import pom.onlinecat;

public class Stepdef_pom {

	WebDriver driver;
	
	@Given ("^I launch Borland URL$")
	public void Launch() throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\seleniumjars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.borland.com/gmopost/");
		driver.manage().window().maximize();
	
}
	@When ("^I Click on Enter GMO online button in GMO online page$")
	public void Click(){	
		entergmo eg = new entergmo(driver);
		eg.click_entergmo();
}
	@Then ("^I Enter quantity as \"(.*)\" in Onlinecatlog page$")
	public void Enter(String Itemnum){
		onlinecat oc =  new onlinecat(driver);
		oc.Onlinecatalog(Itemnum);
		
	}
}
