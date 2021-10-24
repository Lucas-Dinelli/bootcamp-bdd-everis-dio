package com.everis.steps;

import com.everis.pages.TransportePage;

import io.cucumber.java.pt.E;

public class TransporteSteps {
	
	@E("^escolhe a forma de transporte$")
	public void escolherFormaDeTransporte() {
		TransportePage transportePage = new TransportePage();
		transportePage.escolherFormaDeTransporte();
	}

}
