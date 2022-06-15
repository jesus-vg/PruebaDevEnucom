package pruebadevenucom.atletismo;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jesus V. on 15/06/2022 jesusgonzalez@jcodesoft.com
 */
public class Test {
	public static void main( String[] args ) {
		int      cantidadAtletas = getCantidadAtletas();
		Atleta[] atletas         = new Atleta[ cantidadAtletas ];

		for ( int i = 0; i < cantidadAtletas; i++ ) {
			atletas[ i ] = crearAtleta( i );
		}

		mostrarDatosAtletaGanador( atletas );
	}

	private static void mostrarDatosAtletaGanador( Atleta[] atletas ) {
		Atleta atletaGanador = atletas[ 0 ];

		for ( Atleta atleta : atletas ) {
			if ( atleta.getTiempoCarrera().compareTo( atletaGanador.getTiempoCarrera() ) < 1 ) {
				atletaGanador = atleta;
			}
		}

		System.out.println( "Los datos del atleta ganador son: \n" + atletaGanador );
	}

	private static Atleta crearAtleta( int indice ) {
		Scanner entrada = new Scanner( System.in );

		System.out.println( "Ingrese los datos del atleta #" + ( indice + 1 ) );

		System.out.print( "Ingrese el nombre: " );
		String nombre = entrada.next();

		int numeroAtleta = 0;

		do {
			System.out.print( "Ingrese el número del atleta: " );
			try {
				numeroAtleta = new Scanner( System.in ).nextInt();
			} catch ( InputMismatchException ignored ) {
				System.out.println( "Valor no valido...\n" );
			}
		}
		while ( numeroAtleta == 0 );

		BigDecimal tiempoCarrera = null;

		do {
			System.out.print( "Ingrese el tiempo de carrera: " );
			try {
				tiempoCarrera = new Scanner( System.in ).nextBigDecimal();
			} catch ( InputMismatchException ignored ) {
				System.out.println( "Valor no valido...\n" );
			}
		}
		while ( tiempoCarrera == null );

		System.out.println();

		return new Atleta( numeroAtleta, nombre, tiempoCarrera );
	}

	private static int getCantidadAtletas() {
		int cantidad = 0;

		do {
			System.out.print( "Ingrese la cantidad de atletas a registrar: " );

			try {
				cantidad = new Scanner( System.in ).nextInt();
			} catch ( InputMismatchException ignored ) {
				System.out.println( "Valor no valido...\n" );
			}
		} while ( cantidad == 0 );

		System.out.println( "------" );
		return cantidad;
	}
}
