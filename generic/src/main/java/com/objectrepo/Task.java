package com.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task {
	@FindBy(linkText="Projects and Customer")
	private WebElement Customer;
	public void navigatetoCustomer() {
		Customer.click();
	}

}
