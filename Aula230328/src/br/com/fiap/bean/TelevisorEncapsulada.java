
//Programa para simular funcionalidades de uma TV (Definir e aumentar volume, definir e mudar canal)
//Foram usados conceitos de encapsulamento, laço de repetição, condicional, leitura e escrita

package br.com.fiap.bean;

public class TelevisorEncapsulada {
	private int volume, canal;
	//gets e sets	
	public int getVolume() {
		return volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setVolume(int volume) {
		try {
			//Regra de negócio - Volume permitido entre 0 e 20
			if (volume >= 0 && volume <=20) {
				this.volume = volume;
				
			} else {
				throw new Exception("Volume fora da faixa permitida (0 - 20)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void setCanal(int canal) {
		try {
			//Regra de negócio - Canais permitidos (2,4,5,7,13)
			if (canal==2 || canal==4 ||canal==5 ||canal==7||canal==13) {
				this.canal = canal;
				
			} else {
				throw new Exception("Canal fora da lista permitida (2, 4, 5, 7 e 13)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	//métodos
	//Regra de negócio - Volume permitido entre 0 e 20
	public void aumentarVolume() {	
		if (volume <20) {
			volume++;
		}
	}
	public void diminuirVolume() {
		if (volume>0) {
			volume--;			
		}
	}
	public void mostrar() {
		System.out.println("\nCanal: "+getCanal() + "\nVolume: "+getVolume());
	}
}
