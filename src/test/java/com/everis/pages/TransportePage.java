package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class TransportePage extends BasePage {
	
	@FindBy(id = "cgv")
	protected WebElement checkboxTermosDeServico;
	
	@FindBy(name = "processCarrier")
	protected WebElement botaoProsseguir;
	
	public TransportePage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void escolherFormaDeTransporte() {
		checkboxTermosDeServico.click();
		botaoProsseguir.click();
		log("Transporte escolhido");
	}

}
