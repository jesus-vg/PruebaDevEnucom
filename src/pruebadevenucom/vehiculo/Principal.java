package pruebadevenucom.vehiculo;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jesus V. on 15/06/2022 jesusgonzalez@jcodesoft.com
 */
public class Principal {
	public static void main( String[] args ) {
		int        cantidadVehiculos = getCantidadVehiculos();
		Vehiculo[] vehiculos         = new Vehiculo[ cantidadVehiculos ];

		for ( int i = 0; i < cantidadVehiculos; i++ ) {
			vehiculos[ i ] = crearVehiculo( i );
		}

		mostrarDatosAutoMasBarato( vehiculos );
	}

	private static void mostrarDatosAutoMasBarato( Vehiculo[] vehiculos ) {
		Vehiculo vehiculoMasBarato = vehiculos[ 0 ];

		for ( Vehiculo vehiculo : vehiculos ) {
			if ( vehiculo.getPrecio().compareTo( vehiculoMasBarato.getPrecio() ) < 1 ) {
				vehiculoMasBarato = vehiculo;
			}
		}

		System.out.println( "Los datos del auto más barato son: \n" + vehiculoMasBarato );
	}

	private static Vehiculo crearVehiculo( int indice ) {
		Scanner  entrada  = new Scanner( System.in );
		Vehiculo vehiculo = null;

		System.out.println( "Ingrese los datos para el autómovil #" + ( indice + 1 ) );

		System.out.print( "Ingrese el modelo: " );
		String modelo = entrada.next();

		System.out.print( "Ingrese la marca: " );
		String marca = entrada.next();

		BigDecimal precio = null;

		do {
			System.out.print( "Ingrese el precio: " );
			try {
				precio = new Scanner( System.in ).nextBigDecimal();
			} catch ( InputMismatchException ignored ) {
				System.out.println( "Precio no valido...\n" );
			}
		}
		while ( precio == null );

		vehiculo = new Vehiculo( marca, modelo, precio );

		System.out.println();

		return vehiculo;
	}

	private static int getCantidadVehiculos() {
		int cantidadVehiculos = 0;

		do {
			System.out.print( "Ingrese la cantidad de vehículos a registrar: " );

			try {
				cantidadVehiculos = new Scanner( System.in ).nextInt();
			} catch ( InputMismatchException ignored ) {
				System.out.println( "Valor no valido...\n" );
			}
		} while ( cantidadVehiculos == 0 );

		System.out.println( "------" );
		return cantidadVehiculos;
	}
}
