package amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import hyrtutorials.homepage;
import utilitiespack.utilities;

public class Task_3 extends utilities {
  @Test(priority=1)
  public void test1() throws InterruptedException {
	  hompage urlob=new hompage(driver);
	  urlob.currenturl();
	  urlob.pagetitle();
	  urlob.acclistbuttondrwabo();
	  urlob.hoverover();
   account_listbuttn button_ob=new account_listbuttn(driver);
   button_ob.startsellingbdrawborderandflash();
   button_ob.startselllingbtclcik();
urlob.searchfieldclick("phones");

	  
	  
  }
  @Test(priority=2)
  public void test2() {
	  hompage hpob=new hompage(driver);
	  hpob.phonetext();
	  hpob.department();
  }
}
