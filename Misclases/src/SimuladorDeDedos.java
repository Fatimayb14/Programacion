package MisClases;



import java.util.Random;



public class SimuladorDados {

	//• numeroLanzamientos: para llevar un registro de cuántas veces se han lanzado. 

	//• dado1, dado2, dado3 y dado4: para almacenar el último lanzamiento de dados. 

	// ATRIBUTOS

	private int numeroLanzamientos;

	private int dado1;

	private int dado2;

	private int dado3;

	private int dado4;



	// METODOS



	// Constructor

	//• int lanzarDado(): que simula el lanzamiento de un dado

	private SimuladorDados() {

		numeroLanzamientos = 0;

		dado1 = 1;

		dado2 = 1;

		dado3 = 1;

		dado4 = 1;

	}



	//• lanzarDados (): que simulará el lanzamiento de los dados e incrementará el número de 

	//lanzamientos.

	private int lanzarDado() {

		Random numeroAleatorio = new Random();

		return numeroAleatorio.nextInt(1, 7);

	}

	

	public void lanzarDados() {

		dado1 = lanzarDado();

		dado2 = lanzarDado();

		dado3 = lanzarDado();

		dado4 = lanzarDado();



		numeroLanzamientos++;



	}

	//getUltimaJugada(): que mostrará por pantalla la última tirada hecha

	

	public void getUltimaJugada() {



		System.out.println("La ultima tirada del dado1 es :" + dado1);

		System.out.println("La ultima tirada del dado2 es :" + dado2);

		System.out.println("La ultima tirada del dado3 es :" + dado3);

		System.out.println("La ultima tirada del dado4 es :" + dado4);

	}

	//getNumeroLanzamientos: que devuelve el número de lanzamientos hechos.     

	public int getNumeroLanzamientos() {

		return numeroLanzamientos;

	}



	public int calcularSumaUltimoLanzamiento() {

		int resultado;



		return resultado = dado1 + dado2 + dado3 + dado4;



	}

	

	public int comprobarResultadoUltimoLanzamiento() {

		

		// Chequeo póker

		if (dado1==dado2 && dado2==dado3 && dado3==dado4)

			return 4;



		// Chequeo trío		

		if(   (dado1==dado2 && dado2==dado3)   ||     // 123

			  (dado1==dado3 && dado1==dado4)   ||     // 134

			  (dado2==dado3 && dado2==dado4)   ||     // 234

			  (dado1==dado2 && dado1==dado4)          // 124

		  )

			return 3;

		

		// Chequeo dobles parejas

		if(   (dado1==dado2 && dado3==dado4)   ||     // 12   34

			  (dado1==dado3 && dado2==dado4)   ||     // 13   24

			  (dado1==dado4 && dado2==dado3)          // 14   23

		  )

			return 2;



		// Chequeo pareja simple		

		if(dado1==dado2 || dado1==dado3 || dado1==dado4  || 

		   dado2==dado3  || dado2==dado4  || dado3==dado4)

			return 1;

		

		return 0;

	}

 	public void estadísticasTiradas(int numero) {
 		int numeroPoker=0;
 		int numeroTrio=0 
 		int 
 		int
 		
 		for (int i=0;<numero;i++)
 		{
 			//Lanzamos los dados una vez
 			lanzarDados();
 			int resultado=comprobarResultadoUltimoLanzamiento();
 			salir=true;
 			
 		}
 		
 			
 			
 		}
 		
 	
 		}
 	}


}
