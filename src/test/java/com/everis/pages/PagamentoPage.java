package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class PagamentoPage extends BasePage {
	
	@FindBy(css = "[title = 'Pay by bank wire']")
	protected WebElement botaoPagarPorTransferenciaBancaria;
	
	@FindBy(xpath = "//*[@type = 'submit']//*[text() = 'I confirm my order']")
	protected WebElement botaoConfirmar;
	
	public PagamentoPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void confirmarPagamento() {
		botaoPagarPorTransferenciaBancaria.click();
		botaoConfirmar.click();
		log("Pagamento confirmado");
	}

}
