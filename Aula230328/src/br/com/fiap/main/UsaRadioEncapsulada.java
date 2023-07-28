//Programa para simular funcionalidades de um rádio (definir e aumentar volume, definir e mudar de estação).
//Foram usados conceitos de encapsulamento, tratamento de erros, condicionais
package br.com.fiap.main;

import br.com.fiap.bean.RadioEncapsulada;

public class UsaRadioEncapsulada {

	public static void main(String[] args) {	
		//declaração e instanciação objeto
		RadioEncapsulada radio_toshiba = new RadioEncapsulada();	
		//definição dos valores dos atributos da classe RadioEncapsulada
		radio_toshiba.setEstacao(80.0f);
		radio_toshiba.setVolume(100);
		//uso dos métodos da classe RadioEncapsulada
		radio_toshiba.mostrar();
		radio_toshiba.setVolume(0);
		radio_toshiba.aumentarVolume();		
		radio_toshiba.mostrar();
	}
}
