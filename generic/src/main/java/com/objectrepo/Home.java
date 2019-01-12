package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(linkText="Logout")
	private WebElement logoutlink;
	@FindBy(partialLinkText="Tasks")
	private WebElement taskimg;
	public void logout()
	{
		logoutlink.click();
	}
	public void navigateTotask()
	{
		taskimg.click();
	}
	

}
