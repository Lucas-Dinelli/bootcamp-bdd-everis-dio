package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class EnderecoCompraPage extends BasePage {
	
	@FindBy(name = "processAddress")
	protected WebElement botaoProsseguir;
	
	public EnderecoCompraPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void confirmarEnderecoDeEntrega() {
		botaoProsseguir.click();
		log("Endereco de entrega confirmado");
	}
	
}
