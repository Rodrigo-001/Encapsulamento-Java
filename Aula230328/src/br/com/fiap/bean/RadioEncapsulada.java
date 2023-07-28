//Programa para simular funcionalidades de um rádio (definir e aumentar volume, definir e mudar de estação).
//Foram usados conceitos de encapsulamento, tratamento de erros, condicionais

package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class RadioEncapsulada {
	private int volume;
	private float estacao;
	//
	public int getVolume() {
		return volume;
	}
	public float getEstacao() {
		return estacao;
	}
	public void setVolume(int volume) {	//regra de negócio - volume permito entre 0 e 100
		try {
			if (volume >= 0 && volume <= 100) {
				this.volume = volume;				
			} else {
				throw new Exception("Fora da faixa permitida (0 - 100)");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public void setEstacao(float estacao) {		//regra de negócio - estação permitida entre 80.0 e 105.0
		try {
			if (estacao >= 80.0 && estacao <= 105.0) {						
				this.estacao = estacao;
			} else {
				throw new Exception("Estação fora da faixa permitida (80.0 a 105.0)");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	//métodos	
	public void aumentarVolume() {	//sempre que chamado, aumenta volume em 1
		if (volume < 100) {
			volume++;
	}
	}		
	public void diminuirVolume() {	//sempre que chamado, diminui volume em 1
		if (volume > 0) {
			volume--;
	}
	}
	//sempre que chamado, imprime volume e estação atuais
	public void mostrar() {
		JOptionPane.showMessageDialog(null, "Estação:"+estacao
				+"\nVolume: "+volume);
	}
	
}
