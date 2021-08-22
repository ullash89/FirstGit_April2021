package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) throws InterruptedException {
		
		//Scanner scn = new Scanner(System.in);
		
		//polymorphisom
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\AprilQA2021_selenium\\First_Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
