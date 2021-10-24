package com.everis.steps;

import com.everis.pages.PagamentoPage;

import io.cucumber.java.pt.Quando;

public class PagamentoSteps {
	
	@Quando("^o pagamento for confirmado$")
	public void confirmarPagamento() {
		PagamentoPage pagamentoPage = new PagamentoPage();
		pagamentoPage.confirmarPagamento();
	}

}
