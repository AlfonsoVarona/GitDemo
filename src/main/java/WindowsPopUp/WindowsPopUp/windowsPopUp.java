package WindowsPopUp.WindowsPopUp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class windowsPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		/*
		 There are some pages where we can find pop-up windows which don't comes from web site itself but Windows OS.
		 In that cases, when opening the web site it is needed to send in next way:
		 	"https://" + UserName + ":" + Password + "@" + web site address 
		*/
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/basic_auth']")).click();
		
	}

}
