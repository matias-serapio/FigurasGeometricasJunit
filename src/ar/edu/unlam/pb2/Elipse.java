package ar.edu.unlam.pb2;

public class Elipse extends Figura {
	protected Punto centro;
	private Double radioMayor;
	private Double radioMenor;

	public Elipse(Punto centro, Double radioMayor, Double radioMenor) {
		this.centro = centro;
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	@Override
	public void mover(Double deltaX, Double deltaY) {
		centro.mover(deltaX, deltaY);
	}

	@Override
	public Double area() {
		return Math.PI * radioMayor * radioMenor;
	}

	public Punto getCentro() {
		return centro;
	}
}
