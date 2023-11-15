package proyectos;

import java.util.Scanner;

public class Ejerciciodeoperaciones {

	public static void main(String[] args) {
		// Declarar variable
		int numero1 ;
		int numero2;
		int opcionElegida;
		int resultado;
		float resultadoDecimal;
		// Pedir primer numero por teclado 
		
		
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Escribe el primer numero");
		
		
		numero1=teclado.nextInt();
		
		Scanner teclado2= new Scanner (System.in);
		System.out.println("Escribe el segundo numero");
		
		
		numero2=teclado2.nextInt();
		
		
		// Mostramos el menú de opciones al usuario
		
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicacion");
		System.out.println("4.division entero");
		System.out.println("5.division decimal");
		System.out.println("6.modulo (resto)");
		
		
		System.out.println("Selecciona una opción");
		
		opcionElegida=teclado.nextInt();
		
		if ( opcionElegida==1)
		{
			// Suma
			resultado=numero1+numero2;
			System.out.println("El resultado de la suma: " + resultado);
			
		}
		else if ( opcionElegida==2) 
		{
			// 	Resta
			resultado=numero1+numero2;
			System.out.println("El resultado de la resta: " + resultado);
		}	
		else if ( opcionElegida==3) 
		{
				
				//Multiplicación
				resultado=numero1* numero2;
				System.out.println("El producto es : " + resultado);
		}
	
		else if (opcionElegida==4)
		{
				// division entera
				if (numero2!=0)
				{
					resultado=numero1/ numero2;
					System.out.println("La disivion entera es  : " + resultado);
				}
		}
		else if (opcionElegida==5)
		{
				//Division decimal
				if(numero2!=0)
				{
					resultadoDecimal=(float) numero1 % numero2;
					System.out.println("El resto de la division es  : " + resultadoDecimal );
				
				}
		}
		else 
		{
			
			System.out.println("La opcion elegida no es correcta");
				
		}
				
		
		
		
		
		

	}
	
	// Cierro el teclado porque ya no lo utilizo más

}

