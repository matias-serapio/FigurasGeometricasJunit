package ar.edu.unlam.pb2;

public class Punto {
	private Double x;
	private Double y;

	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public void mover(Double deltaX, Double deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
}
