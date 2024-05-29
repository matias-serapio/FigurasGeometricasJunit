package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionFiguras {
	private List<Figura> figuras;

	public ColeccionFiguras() {
		figuras = new ArrayList<>();
	}

	public void agregarFigura(Figura figura) {
		figuras.add(figura);
	}

	public Double calcularAreaTotal() {
		Double areaTotal = 0.0;
		for (Figura figura : figuras) {
			areaTotal += figura.area();
		}
		return areaTotal;
	}
}
