package amazon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import javascriptutilitiespack.javascriptutilites;

public class hompage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Account & Lists']") WebElement acc_listbutton;
	@FindBy(xpath="(//span[text()='Start a Selling Account'])[1]") WebElement startsellingbt;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement searchfield;
	@FindBy(xpath="//input[@id='nav-search-submit-button']") WebElement searchbutton;
	@FindBy(xpath="(//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span)[1]") WebElement phone;
	@FindBy(xpath="//div[@id='n-title']/child::span") WebElement department;
	
	public void department() {
		javascriptutilites.scrollIntoView(driver, department);
		javascriptutilites.draW_border(driver, department);
		javascriptutilites.scrollpagedown(driver);
		javascriptutilites.generatealert(driver,"this page having problem");
		
		
	}
	
	public void phonetext() {
		String text= phone.getText();
		if(text.equalsIgnoreCase(text)) {
			System.out.println("the phone text is correct");
		}
		else {
			System.out.println("the phone text is wrong");
		}
	}
	
	public void searchfieldclick(String itemname) {
		searchfield.click();
		searchfield.sendKeys(itemname);
		searchbutton.click();
	}
	
	public void startsellingbdrawborderandflash() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(startsellingbt));
		javascriptutilites.flashingblue(startsellingbt, driver);
		javascriptutilites.draW_bordergreen(driver, startsellingbt);
	}
	public void startselllingbtclcik() {
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).build().perform();
javascriptutilites.jsclick(driver, startsellingbt);
act.keyUp(Keys.SHIFT).build().perform();
	}
	
	public void acclistbuttondrwabo() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(acc_listbutton)).findElement(By.xpath("//span[text()='Account & Lists']"));
	javascriptutilites.draW_border(driver, acc_listbutton);	
	}
	public void hoverover() {
		Actions act=new Actions(driver);
		act.moveToElement(acc_listbutton).build().perform();
	}
	public void pagetitle() {
		String title= driver.getTitle();
		System.out.println("the title is="+title);
		if(title.equalsIgnoreCase("Amazon.com. Spend less. Smile more.")) {
			System.out.println("the title is correct");
		}
		else {
			System.out.println("the title is wrong");
		}
	}
	 
	public void currenturl() {
		String url= driver.getCurrentUrl();
		System.out.println("the amazon page url="+url);
		if(url.equalsIgnoreCase("https://www.amazon.com/")) {
			System.out.println("the url is currect");
		}
		else  {
			System.out.println("the url is wrong");
		}
	}
	public hompage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
