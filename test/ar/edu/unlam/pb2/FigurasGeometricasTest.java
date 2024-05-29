package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigurasGeometricasTest {

	@Test
	public void testCrearYMoverPunto3VecesDerecha4VecesArriba() {
		// Preparación
		Double x = 0.0;
		Double y = 0.0;
		Double valorEsperadoX = 3.0;
		Double valorEsperadoY = 4.0;

		Punto p = new Punto(x, y);

		// Ejecución
		p.mover(valorEsperadoX, valorEsperadoY);
		Double valorObtenidoX = p.getX();
		Double valorObtenidoY = p.getY();

		// Contrastación
		assertEquals(valorEsperadoX, valorObtenidoX);
		assertEquals(valorEsperadoY, valorObtenidoY);
	}

	@Test
	public void testCrearYCalcularAreaElipseConRadioMayor3YRadioMenor2() {
		// Preparación
		Double puntoX = 0.0;
		Double puntoY = 0.0;
		Double elipseRadioMayor = 3.0;
		Double elipseRadioMenor = 2.0;
		Double valorEsperado = Math.PI * elipseRadioMayor * elipseRadioMenor;

		Elipse e = new Elipse(new Punto(puntoX, puntoY), elipseRadioMayor, elipseRadioMenor);

		// Ejecución
		Double valorObtenido = e.area();

		// Contrastación
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testCrearYMoverElipseConRadioMayor3YRadioMenor2CincoVecesDerechaCincoVecesArriba() {
		// Preparación
		Double puntoX = 0.0;
		Double puntoY = 0.0;
		Double elipseRadioMayor = 3.0;
		Double elipseRadioMenor = 2.0;
		Double valorEsperadoX = 5.0;
		Double valorEsperadoY = 5.0;

		Elipse e = new Elipse(new Punto(puntoX, puntoY), elipseRadioMayor, elipseRadioMenor);

		// Ejecución
		e.mover(5.0, 5.0);
		Double valorObtenidoX = e.getCentro().getX();
		Double valorObtenidoY = e.getCentro().getY();

		// Contrastación
		assertEquals(valorEsperadoX, valorObtenidoX);
		assertEquals(valorEsperadoY, valorObtenidoY);

	}

	@Test
	public void testCrearYCalcularAreaCirculoPosicionadoEnUnoConRadioTres() {
		// Preparación
		Double puntoX = 1.0;
		Double puntoY = 1.0;
		Double radio = 3.0;
		Double valorEsperado = Math.PI * radio * radio;
		Circulo c = new Circulo(new Punto(puntoX, puntoY), radio);

		// Ejecución
		Double valorObtenido = c.area();

		// Contrastación
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testCrearYMoverCirculoPosicionadoEnUnoQueSeMueva4VecesDerecha4VecesArriba() {
		// Preparación
		Double puntoX = 1.0;
		Double puntoY = 1.0;
		Double radio = 3.0;
		Double valorEsperadoX = 5.0;
		Double valorEsperadoY = 5.0;

		Circulo c = new Circulo(new Punto(puntoX, puntoY), radio);

		// Ejecución
		c.mover(4.0, 4.0);
		Double valorObtenidoX = c.getCentro().getX();
		Double valorObtenidoY = c.getCentro().getY();

		// Contrastación
		assertEquals(valorEsperadoX, valorObtenidoX);
		assertEquals(valorEsperadoY, valorObtenidoY);
	}

	@Test
	public void testCrearYCalcularAreaRectanguloPuntoInferiorIzquierdaCuatroYPuntoEsquinaSuperiorDerechaCincoPosicionadoEnElCentro() {

		// Preparación

		Double puntoX = 0.0;
		Double puntoY = 0.0;
		Double puntoEsquinaInferiorIzquierda = 4.0;
		Double puntoEsquinaSuperioDerecha = 5.0;
		Double valorEsperado = puntoEsquinaInferiorIzquierda * puntoEsquinaSuperioDerecha;

		Rectangulo r = new Rectangulo(new Punto(puntoX, puntoY),
				new Punto(puntoEsquinaInferiorIzquierda, puntoEsquinaSuperioDerecha));

		// Ejecución

		Double valorObtenido = r.area();

		// Contrastación
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testCrearYMoverRectanguloPosicionadoEnElCentroConEsquinaInferiorIzquierda4YEsquinaSuperiorDerecha5() {

		// Preparación
		Double puntoX = 0.0;
		Double puntoY = 0.0;
		Double puntoEsquinaInferiorIzquierda = 4.0;
		Double puntoEsquinaSuperioDerecha = 5.0;
		Double valorEsperadoX1 = 2.0;
		Double valorEsperadoY1 = 3.0;
		Double valorEsperadoX2 = 6.0;
		Double valorEsperadoY2 = 8.0;

		Rectangulo r = new Rectangulo(new Punto(puntoX, puntoY),
				new Punto(puntoEsquinaInferiorIzquierda, puntoEsquinaSuperioDerecha));
		r.mover(2.0, 3.0);

		// Ejecución

		Double valorObtenidoX1 = r.getEsquinaInferiorIzquierda().getX();

		Double valorObtenidoY1 = r.getEsquinaInferiorIzquierda().getY();

		Double valorObtenidoX2 = r.getEsquinaSuperiorDerecha().getX();

		Double valorObtenidoY2 = r.getEsquinaSuperiorDerecha().getY();

		// Contrastación
		assertEquals(valorEsperadoX1, valorObtenidoX1);
		assertEquals(valorEsperadoY1, valorObtenidoY1);
		assertEquals(valorEsperadoX2, valorObtenidoX2);
		assertEquals(valorEsperadoY2, valorObtenidoY2);

	}

	@Test
	public void testCrearYCalcularAreaCuadrado() {

		// Preparación
		Double puntoX = 0.0;
		Double puntoY = 0.0;
		Double lado = 4.0;
		Double valorEsperado = lado * lado;

		Cuadrado s = new Cuadrado(new Punto(puntoX, puntoY), lado);

		// Ejecución
		Double valorObtenido = s.area();

		// Contrastación
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void testCrearYMoverCuadrado() {

		// Preparación
		Double puntoX = 0.0;
		Double puntoY = 0.0;
		Double lado = 4.0;
		Double valorEsperadoX1 = 3.0;
		Double valorEsperadoY1 = 3.0;
		Double valorEsperadoX2 = 7.0;
		Double valorEsperadoY2 = 7.0;

		Cuadrado s = new Cuadrado(new Punto(puntoX, puntoY), lado);
		s.mover(3.0, 3.0);
		// Ejecución
		Double valorObtenidoX1 = s.getEsquinaInferiorIzquierda().getX();

		Double valorObtenidoY1 = s.getEsquinaInferiorIzquierda().getY();

		Double valorObtenidoX2 = s.getEsquinaSuperiorDerecha().getX();

		Double valorObtenidoY2 = s.getEsquinaSuperiorDerecha().getY();

		// Contrastación
		assertEquals(valorEsperadoX1, valorObtenidoX1);
		assertEquals(valorEsperadoY1, valorObtenidoY1);
		assertEquals(valorEsperadoX2, valorObtenidoX2);
		assertEquals(valorEsperadoY2, valorObtenidoY2);

	}
}
