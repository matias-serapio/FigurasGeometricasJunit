package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionFiguras {
	private List<Figura> figuras = new ArrayList<Figura>();

	public void agregarFigura(Figura figura) {
		this.figuras.add(figura);
	}

	public Double calcularAreaTotal() {
		Double areaTotal = 0.0;
		for (Figura figura : figuras) {
			areaTotal += figura.area();
		}
		return areaTotal;
	}

	public Double calcularAreaTotalFiguras() {
		Double areaTotal = 0.0;
		for (Figura figura : this.figuras) {
			areaTotal += figura.area();
		}
		return areaTotal;
	}

	public List<Figura> getFiguras() {
		return this.figuras;
	}
}