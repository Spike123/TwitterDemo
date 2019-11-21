package tweet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DeleteTheReply {

	public static void main(String[] args) {

		WebDriver firefox = new FirefoxDriver();
		firefox.get("https://twitter.com/login");
		firefox.findElement(By.className("js-username-field email-input js-initial-focus")).sendKeys("nikolay.yankulov");;
		firefox.findElement(By.className("js-username-field email-input js-initial-focus")).sendKeys("kolonia87");;
		System.out.println("success");
	}

}
