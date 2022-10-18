package com.tds.ifsc;

public class TestePato {

	public static void main(String[] args) {
		
		System.out.println("Patolino:\n");
		Pato patolino = new Pato();
		patolino.display();
		patolino.quack();
		patolino.nadar();
		patolino.voar();
		
		System.out.println("\nPato-Real:\n");
		PatoReal real = new PatoReal();
		real.display();
		real.quack();
		real.nadar();
		real.voar();
		
		System.out.println("\nPato-Vermelho:\n");
		PatoVermelho vermelho = new PatoVermelho();
		vermelho.display();
		vermelho.quack();
		vermelho.nadar();
		vermelho.voar();
		
		System.out.println("\nPato de Borracha:\n");
		PatoBorracha borracha = new PatoBorracha();
		borracha.display();
		borracha.boiar();
		borracha.squeck();
		
		System.out.println("\nPato de Madeira:\n");
		PatoMadeira madeira = new PatoMadeira();
		madeira.display();
		madeira.enfeite();
	}

}
