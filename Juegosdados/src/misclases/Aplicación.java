package misclases;

public class Aplicación {

	public static void main(String[] args) {
		
		
		boolean salir= false;
		
		
		Juego miJuego=new Juego();
		
		
		while ( salir==false)
		{
			
			system.out.println("Tu saldo actual es : " + miJuego.getSaldo());
			system.out.println("¿Qué quieres hacer?");
			system.out.println("1- Recargar saldo");
			system.out.println("2 - Hacer apuesta ");
			system.out.println("3 - salir");
			int opcion =teclado.nextInt();
			
			if (opcion==1)
			{
				// Recargar saldo
				system.out.println("¿Cuánto quieres recargar?";
				int cantidad=teclado.nextInt();
				miJuego.incrementarSaldo(cantidad);
				
				
			}
		
			else if (opcion==2)
			{
				
				system.out.println("¿Cuánto quieres apostar?");
				int cantidad=teclado.nextInt();
				if(miJuego. hacerApuesta(cantidad)==-1)
					system.out.println("No tienes saldo suficiente");
				
			}
			else salir=true
			
		}
		
			// Cerramos el objeto de la clase Scanner
			teclado.close ();
			
		}

	}

}
