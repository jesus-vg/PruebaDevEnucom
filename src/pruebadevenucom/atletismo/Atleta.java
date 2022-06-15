package pruebadevenucom.atletismo;

/*
 * Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas
 * caracterizados por número de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los
 * datos del atleta ganador de la carrera.
 */

import java.math.BigDecimal;

/**
 * @author Jesus V. on 15/06/2022 jesusgonzalez@jcodesoft.com
 */
public class Atleta {
	private int        numeroAtleta;
	private String     nombre;
	private BigDecimal tiempoCarrera;

	public Atleta( int numeroAtleta, String nombre, BigDecimal tiempoCarrera ) {
		this.numeroAtleta  = numeroAtleta;
		this.nombre        = nombre;
		this.tiempoCarrera = tiempoCarrera;
	}

	public BigDecimal getTiempoCarrera() {
		return tiempoCarrera;
	}

	@Override
	public String toString() {
		return String.format(
			"Atleta{ numeroAtleta = %d, nombre = '%s', tiempoCarrera = %s }",
			numeroAtleta,
			nombre,
			tiempoCarrera
		);
	}
}
