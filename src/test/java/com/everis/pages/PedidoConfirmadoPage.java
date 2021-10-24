package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class PedidoConfirmadoPage extends BasePage {
	
	@FindBy(xpath = "//*[text()='Your order on My Store is complete.']")
	protected WebElement textoDeConfirmacao;
	
	public PedidoConfirmadoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public boolean apresentouPedidoConfirmado(String mensagemDeConfirmacao) {
		if(textoDeConfirmacao.getText().equals(mensagemDeConfirmacao)) {
			log("Apresentou a mensagem [" + mensagemDeConfirmacao + "] conforme o esperado.");
			return true;
		}
		logFail("Deveria ter apresentado a mensagem '" + mensagemDeConfirmacao + "'.");
		return false;
	}
	
}
