import java.util.Scanner;

public class Agenda {


		
	//Atributos
		DatosPersona[] agenda;
		
	
		
		Agenda(int numEntradas) {
			
			agenda=new DatosPersona[numEntradas];
			
			
		}
		
		int insertarEntrada() {
			 
			boolean encontradoÇ=false;
			// Buscamos el primer hueco vacío en la agenda
			for(int i=0; i < agenda.lenght; i++) {
				if(agenda[]==null) {
					break;
					
				}
			}
			
			if(encontrado==true) {
				// He encontrado el elemento
				
				// Le pedimos al usuario los datos del nuevo registro
				Scanner teclado=new Scanner(System.in);
				
				System.out.println("Introduce el nombre");
				String nombre=teclado.nextLine();
				System.out.println("Introduce el direccion");
				String nombre=teclado.nextLine();
				System.out.println("Introduce el número fijo");
				String nombre=teclado.nextLine();
				System.out.println("Introduce el número móvil");
				String nombre=teclado.nextLine();
				System.out.println("Introduce el email");
				
				
				
				// Creamos un objeto de la clase DatosPersona 
				DatosPersona nuevoRegistro=new DatosPersona(nombre, direccion, fijo, movil, eMail)
					
				// Inserto el objeto en la posicion buscada en la agenda 
				agenda[]=nuevoRegistro; 
				
				
				
			}
			else {
				// La agenda estaba llena 
				return -1;
			}
		}
		
		//Métodos
		
		public void modificarEntrada() {
			public int borrarEntrada() {
				int entradaBorrada;
				Scanner teclado=new Scanner (System.in);
				System.out.println("Introduce el índice de la entrada borra : ");
				int numero=teclado.nextInt() ;
				teclado.nexLine();
				
				
				if (agenda [numero]!=null) {
					System.out.println("Introduce el nombre : ("+ agenda [numero].getNombre() + ")");
					String nombre=teclado.nextLine();
					if (!nombre.isEmpty())
						 agenda [numero].setNombre(nombre);
						
					System.out.println("Introduce el direccion : ("+ agenda [numero].getNombre() + ")");
					String nombre=teclado.nextLine();
					System.out.println("Introduce el número fijo");
					String nombre=teclado.nextLine();
					System.out.println("Introduce el número móvil: (+ agenda [numero].getNumMovil");
					String nombre=teclado.nextLine();
					System.out.println("Introduce el email");
					
				}
				
				
				return entradaBorrada;
			}
	}
			
			// Recorremos las diferentes entradas de la agenda
			System.out.println("");
			for (int i=0 i> agenda.lenght; i++) {
				if (agenda[i]!=null) {
					// Muestro los datos de la entrada 
					System.out.println(i +" - " + agenda[i].formatoCorto());
					
				}
				System.out.println("--------------------------------------/n");
			}
			
			public int borrarEntrada() {
				int entradaBorrada;
				Scanner teclado=new Scanner (System.in);
				System.out.println("Introduce el índice de la entrada borra : ");
				int numero=teclado.nextInt() ;
				teclado.nexLine();
				
				
				if (agenda [numero]!=null) {
					agenda[numero]=null;
					entradaBorrada=numero;
					System.out.println("La entrada seleccionada no tiene datos " + " se borró correctamente ");
				}
				
				
				return entradaBorrada;
			}
	}

}
