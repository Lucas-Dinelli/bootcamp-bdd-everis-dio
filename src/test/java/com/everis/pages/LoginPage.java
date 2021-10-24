package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class LoginPage extends BasePage {
	
	@FindBy(name = "email")
	protected WebElement campoEmailParaRealizarLogin;
	
	@FindBy(name = "passwd")
	protected WebElement campoSenhaParaRealizarLogin;
	
	@FindBy(name = "SubmitLogin")
	protected WebElement botaoRealizarLogin;
	
	public LoginPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void realizarLogin() {
		String email = "everisbootcamp@qabeginner3aa.com";
		campoEmailParaRealizarLogin.sendKeys(email);
		campoSenhaParaRealizarLogin.sendKeys("QA@everis213");
		botaoRealizarLogin.click();
		log("Login realizado com o email [" + email + "]");
	}

}
