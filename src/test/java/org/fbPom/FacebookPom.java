package org.fbPom;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPom extends BaseClass {
	
	public FacebookPom() {
PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(id="email")
	private WebElement txtemail;
	
	
	@FindBy(id="pass")
	private WebElement txtpswd;
	
	@FindBy(name="login")
	private WebElement loginbtn;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpswd() {
		return txtpswd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	



	

}
