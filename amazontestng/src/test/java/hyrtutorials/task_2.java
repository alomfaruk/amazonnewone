package hyrtutorials;

import org.testng.annotations.Test;

import javascriptutilitiespack.javascriptutilites;
import utilitiespack.utilities;

public class task_2 extends utilities{
  @Test
  public void f() throws InterruptedException {
	  homepage ob=new homepage(driver);
	  ob.seleniumpbuttonflashing();
	  alter alo=new alter(driver);
	  alo.alterbuttonclick();
	  alo.firstbuttonclick();
	  alo.confirmbutton();
	  alo.thirdbuttonclick();
	  
  }
}
