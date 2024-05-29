package ar.edu.unlam.pb2;

public class Circulo extends Elipse {
	public Circulo(Punto centro, Double radio) {
		super(centro, radio, radio);
	}

	public Punto getCentro() {
		return centro;
	}
}
