package com.everis.steps;

import static org.junit.Assert.assertTrue;

import com.everis.pages.PedidoConfirmadoPage;

import io.cucumber.java.pt.Entao;

public class PedidoConfirmadoSteps {
	
	@Entao("^deve ser apresentado a mensagem \"(.*)\"$")
	public void apresentouMensagemDeSucesso(String mensagemDeConfirmacao) {
		PedidoConfirmadoPage pedidoConfirmadoPage = new PedidoConfirmadoPage();
		assertTrue("Deveria ter apresentado a mensagem [" + mensagemDeConfirmacao + "]", 
				pedidoConfirmadoPage.apresentouPedidoConfirmado(mensagemDeConfirmacao));
	}

}
