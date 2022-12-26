package utilitiespack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class utilities {
	public static WebDriver driver;

  @BeforeClass
  public void beforeClass() {
	  ibrowser("chrome","https://www.amazon.com/");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  //screenshorts();
  }
  @AfterMethod
  public void aftermethod() {
	  screenshorts();
  }
  public void ibrowser(String browser_name,String Browser_url) {
	  String ud= System.getProperty("user.dir");
	  if(browser_name.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", ud+"/driver/chromedriver");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(Browser_url);
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
	  else if (browser_name.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", ud+"/driver/msedgedriver");
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get(Browser_url);
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
	  
  }
  public void screenshorts() {
		String ud= System.getProperty("user.dir");
		System.out.println(ud);
		Date dateinformat=new Date();
		String date= dateinformat.toString().replace(" ","_").replace(":","_");
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screen,new File(ud+"/screenshorts/amazon/"+date+"myss.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

}
