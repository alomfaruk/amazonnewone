package hyrtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import javascriptutilitespack.javascriptutilities;
import javascriptutilitiespack.javascriptutilites;

public class calender {
	WebDriver driver;
	@FindBy(xpath="//input[@id='first_date_picker']") WebElement firstdatefield;
	@FindBy(xpath="//input[@id='second_date_picker']")WebElement seconddatefield;
	@FindBy(xpath="//input[@id='third_date_picker']") WebElement thirddatefield;
	@FindBy(xpath="//select[@class='ui-datepicker-month']") WebElement month;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")WebElement year;
	@FindBy(xpath="//a[text()='17']")WebElement day;
	@FindBy(xpath="//input[@id='fourth_date_picker']")WebElement fourthdatefield;
	public void fourthdate() throws InterruptedException {
		javascriptutilites.jsclick(driver,fourthdatefield);
		Thread.sleep(1000);
		javascriptutilites.draW_bordergreen(driver,fourthdatefield);
		Thread.sleep(1000);
		javascriptutilites.flashing(fourthdatefield, driver);
	}
	public void thirddateall() throws InterruptedException {
		
		javascriptutilites.jsclick(driver,thirddatefield);
		Thread.sleep(1000);
		String day3="12/06/1987";
		javascriptutilites.selectdatejs(driver, day3, thirddatefield);
		javascriptutilites.draW_bordergreen(driver, thirddatefield);
		
	}
	public void thirddate() throws InterruptedException {
		
		thirddatefield.click();
		Thread.sleep(1000);
		day.click();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(month).build().perform();
		Thread.sleep(1000);
		month.click();
		Select ob=new Select(month);
		ob.selectByValue("5");
		Thread.sleep(1000);
		act.moveToElement(year).build().perform();
		Thread.sleep(1000);
		Select oby=new Select(year);
		oby.selectByVisibleText("2013");
		Thread.sleep(1000);
		day.click();
		Thread.sleep(2000);
		//javascriptutilities.draW_bordergreen(driver,thirddatefield);
	
	}
	public void seconddate() throws InterruptedException {
		seconddatefield.click();
		Thread.sleep(1000);
		String day2="02/03/1999";
		javascriptutilites.selectdatejs(driver, day2, seconddatefield);
		Thread.sleep(1000);
		javascriptutilites.draW_border(driver, seconddatefield);
	}
	public void firstdate() throws InterruptedException {
		javascriptutilites.draW_bordergreen(driver, firstdatefield);
		Thread.sleep(1000);
		firstdatefield.click();
		Thread.sleep(1000);
		String day1="10/12/2002";
		javascriptutilites.selectdatejs(driver, day1, firstdatefield);
		javascriptutilites.draW_border(driver, firstdatefield);
		
	}
	public calender(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
}
