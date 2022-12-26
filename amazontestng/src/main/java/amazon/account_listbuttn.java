package amazon;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javascriptutilitiespack.javascriptutilites;

public class account_listbuttn {
	WebDriver driver;
	@FindBy(xpath="(//span[text()='Start a Selling Account'])[1]") WebElement startsellingbt;
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
	public account_listbuttn(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
