package com.tds.ifsc;

public class PatoReal extends Pato implements Voador, Quack{
	
	public PatoReal() {}

	public void display() {
		System.out.println("Oi, eu sou um pato Real!");
	}
	public void voar() {
		System.out.println("Eu estou voando!");

	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}
	
}

