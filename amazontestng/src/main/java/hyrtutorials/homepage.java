package hyrtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javascriptutilitiespack.javascriptutilites;

//import javascriptutilitespack.javascriptutilities;

public class homepage {
	 WebDriver driver;
@FindBy(xpath="//a[text()='Selenium Practice']") WebElement seleniumpbtton;
@FindBy(xpath="(//a[text()='Tutorials'])[2]") WebElement tutorialsbutton;
@FindBy(xpath="//a[text()='Calendars Practice']")WebElement calenderbutton;

public void calenderbuttonclick() {
	
	
	javascriptutilites.draW_border(driver, calenderbutton);
	calenderbutton.click();
}

public void tutorialsbuttonscroll() {
	javascriptutilites.scrollIntoView(driver, seleniumpbtton);
}
public void seleniumpbuttonflashing() {
	javascriptutilites.flashingblue(seleniumpbtton, driver);
	javascriptutilites.draW_border(driver, seleniumpbtton);
	Actions act=new Actions(driver);
	act.moveToElement(seleniumpbtton).build().perform();
	
}
public homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}
