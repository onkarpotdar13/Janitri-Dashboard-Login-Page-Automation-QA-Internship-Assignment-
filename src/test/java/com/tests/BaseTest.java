package com.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

	public static WebDriver driver;
	
	@BeforeClass(groups = "functional")
	@Parameters({"os", "browser"})
	public void setUP(String os, String br) {
		
	switch(br.toLowerCase())
	{
	case "chrome":
		driver = new ChromeDriver();
		break;
	case "edge":
		driver = new EdgeDriver();
		break;
	default:
		return;
	}
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://dev-dash.janitri.in/");
	driver.manage().window().maximize();
		
	}
	
	@AfterClass(groups = "functional")
	public void tearDOWN() {
		driver.quit();
	}
}
