package misclases;

import java.util.Random;

public class Juegos {
	
	// Atributos
	int saldo;
	int dado1;
	int dado2 ;
	int dado3;
	
	// Métodos
	
	void incrementarSaldo(int cantidad) {
		if (cantidad > 0)
			saldo=saldo+cantidad;
		
	}
	
	void getSaldo() {
		return saldo;
	}
	
	void lanzarDados() {
		
		Random numAleatorio=new Random();
		dado1=numAleatorio.nextInt(1,7);
		dado2=numAleatorio.nextInt(1,7);
		dado3=numAleatorio.nextInt(1,7);
	}
	
	int comprobarResultado() {
		// Comprobación de los valores que tienen los dados
		
		
		// Comprobamos de los tres dados son iguales 
		if (dado1==dado2) && (dado2==dado3)
			return 10;
		
		
		// Comprobamos si hay dos dados iguales                                 
		
		else if ((dado1==dado2) || ( dado2==dado3) || (dado1==dado3))
			return 2; 
		
		else resultado=0;
		
		return resultado;
		
	}
	
	int hacerApuesta( int cantidad) {
		int retorno=1;
		if (saldo>=cantidad) {
			
			// Lanzamos los dados 
			lanzarDados();
			
			System.out.println("Han salido los valores ; + dado1 + dado2 + dado3");
			
			// Comprobamos el resultado
			
			int  resultado=comprobarResultado();
			if(resultado==0)
				System.out.println("Lo sentimos, perdiste la apuesta");
			saldo = saldo - cantidad ;
			
			}
			
			else if (resultado==2)

			{
		}
		
		else return -1;
		
	
		
		
		// Si no se cumplen ninguna de las anteriores retornamos 0
				
	}
	
	// Constructor 

}
