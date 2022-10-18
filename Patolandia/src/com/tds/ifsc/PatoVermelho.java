package com.tds.ifsc;

public class PatoVermelho extends Pato implements Voador, Quack{
	
	public PatoVermelho() {}

	public void display() {
		System.out.println("Oi, eu sou um pato Vermelho!");
	}
	public void voar() {
		System.out.println("Eu estou voando!");
	}
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}
}
