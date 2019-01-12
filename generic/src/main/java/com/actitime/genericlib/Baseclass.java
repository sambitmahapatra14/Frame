package com.actitime.genericlib;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.objectrepo.Home;

public class Baseclass {
	public static WebDriver driver;
	public Fileutils file= new Fileutils();
	@BeforeMethod
	public void confBM() throws Throwable {
		Properties pobj= file.getPropertyfile();
		driver.get(pobj.getProperty("url"));
		driver.get(pobj.getProperty("username"));
		driver.get(pobj.getProperty("password"));
	}
	@AfterMethod
	public void confAM() {
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.logout();
	}

}
