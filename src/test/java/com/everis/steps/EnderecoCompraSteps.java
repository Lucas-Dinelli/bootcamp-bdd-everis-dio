package com.everis.steps;

import com.everis.pages.EnderecoCompraPage;

import io.cucumber.java.pt.E;

public class EnderecoCompraSteps {
	
	@E("^confirma o endereco de entrega$")
	public void confirmarEnderecoDeEntrega() {
		EnderecoCompraPage enderecoPage = new EnderecoCompraPage();
		enderecoPage.confirmarEnderecoDeEntrega();
	}

}
