package ar.edu.unlam.pb2;

public class Rectangulo extends Figura {
	private Punto esquinaInferiorIzquierda;
	private Punto esquinaSuperiorDerecha;

	public Rectangulo(Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}

	@Override
	public void mover(Double deltaX, Double deltaY) {
		esquinaInferiorIzquierda.mover(deltaX, deltaY);
		esquinaSuperiorDerecha.mover(deltaX, deltaY);
	}

	@Override
	public Double area() {
		return (esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX())
				* (esquinaSuperiorDerecha.getY() - esquinaInferiorIzquierda.getY());
	}

	public Punto getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	public Punto getEsquinaSuperiorDerecha() {

		return esquinaSuperiorDerecha;
	}
}