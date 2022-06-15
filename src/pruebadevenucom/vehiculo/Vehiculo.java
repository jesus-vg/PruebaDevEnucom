package pruebadevenucom.vehiculo;

import java.math.BigDecimal;

/*
 * Ejercicio:
 * Construir un programa que dada una serie de vehículos, caracterizados por su marca, modelo y precio,
 * imprima las propiedades del objeto más barato. Para ello se debe leer por teclado las características
 * de cada vehículo y crear una clase que represente cada uno de ellos.
 */

/**
 * @author Jesus V. on 15/06/2022 jesusgonzalez@jcodesoft.com
 */
public class Vehiculo {
	private String     marca;
	private String     modelo;
	private BigDecimal precio;

	public Vehiculo( String marca, String modelo, BigDecimal precio ) {
		this.marca  = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return String.format(
				"Vehiculo{ marca = '%s', modelo = '%s', precio = %s }",
				marca,
				modelo,
				precio
		);
	}
}
