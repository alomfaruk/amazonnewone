package hyrtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import javascriptutilitespack.javascriptutilities;
import javascriptutilitiespack.javascriptutilites;



public class alter {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Alerts']")WebElement alterbutton;
	@FindBy(xpath="//button[@id='alertBox']")WebElement firstbutton;
	@FindBy(xpath="//button[@id='confirmBox']")WebElement confirmbutton;
	@FindBy(xpath="//button[@id='promptBox']") WebElement thirdbutton;
	public void thirdbuttonclick() throws InterruptedException {
		javascriptutilites.scrollIntoView(driver,thirdbutton);
		Thread.sleep(2000);
		javascriptutilites.jsclick(driver, thirdbutton);
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		javascriptutilites.draW_borderblue(driver,thirdbutton);
		
	}
	public void confirmbutton() throws InterruptedException {
		confirmbutton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		javascriptutilites.draW_borderblue(driver,confirmbutton);
	}
	public void firstbuttonclick() {
		firstbutton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		javascriptutilites.draW_bordergreen(driver,firstbutton);
	}
	public void alterbuttonclick() {
		javascriptutilites.jsclick(driver, alterbutton);
		List<WebElement> allbutton=driver.findElements(By.tagName("a"));
		int numberofbutton= allbutton.size();
		for(int i=0;i<allbutton.size();i++) {
		System.out.println("All button text"+allbutton.get(i).getText());
		System.out.println("all link is="+allbutton.get(i).getAttribute("href"));
		}
	}
	//}
	public alter (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
