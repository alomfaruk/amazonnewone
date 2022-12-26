package amazon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class sellonamazon {
	WebDriver driver;
	public void windowsession() {
		Set<String>windowsession= driver.getWindowHandles();
		Iterator<String> it=windowsession.iterator();
		 String parents= it.next();
		 String child= it.next();
		 driver.switchTo().window(child);
		 String currenturl= driver.getCurrentUrl();
		 System.out.println("sell on amazon page url="+currenturl);
		 if(currenturl.equalsIgnoreCase(currenturl)) {
			 System.out.println("the url is correct");
		 }
		 else {
			 System.out.println("sell on amazon page url is wrong");
		 }
		 String selltitle=driver.getTitle();
		 System.out.println("amazon sell page title="+selltitle);
		 if(selltitle.equalsIgnoreCase(selltitle)) {
			 System.out.println("sell on amazon page title is correct");
		 }
		 else {
			 System.out.println("sell on amazon title is wrong");
		 }
	}
	public void findbuttontype() {
		 List<WebElement> allbutton= driver.findElements(By.tagName("button"));
		 int numberofbutton= allbutton.size();
		 System.out.println("the total number of button="+numberofbutton);
		 for(int i=0;i<allbutton.size();i++) {
			 System.out.println("the text is="+allbutton.get(i).getText());
		 }
	}
	public sellonamazon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
