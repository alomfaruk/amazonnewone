package javascriptutilitiespack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptutilites {
	public static void jsclick(WebDriver driver,WebElement element) {
		JavascriptExecutor javaexecutor=(JavascriptExecutor)driver;
		javaexecutor.executeScript("arguments[0].click()",element);
	}
	public static void selectdatejs(WebDriver driver,String datevalue,WebElement element) {
		JavascriptExecutor javaexecutor=(JavascriptExecutor)driver;
		javaexecutor.executeScript("arguments[0].setAttribute('value','"+datevalue+"')",element);
	}
	public static void scrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void scrollpagedown(WebDriver driver) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void changecolor(String color,WebElement element,WebDriver driver)   {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void flashing(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++) {
			changecolor("#FF0000", element, driver);
			changecolor(bgcolor, element, driver);
			
		
	}
}
	public static void draW_border(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='5px solid red'",element);
	}
	public static void generatealert(WebDriver driver,String message) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("alert('"+message+"')");
	}
	public static void flashinggreen(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++) {
			changecolor("#00FF00", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}
	public static void flashingblue(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++) {
			changecolor("#0000FF", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}
	public static void draW_borderblue(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='5px solid blue'",element);
	}
	public static void draW_bordergreen(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='5px solid green'",element);
	}

}
