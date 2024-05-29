package ar.edu.unlam.pb2;

public class Cuadrado extends Rectangulo {
	public Cuadrado(Punto esquinaInferiorIzquierda, Double lado) {
		super(esquinaInferiorIzquierda,
				new Punto(esquinaInferiorIzquierda.getX() + lado, esquinaInferiorIzquierda.getY() + lado));
	}
}