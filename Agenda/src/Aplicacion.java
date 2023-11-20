
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agenda miAgenda=new Agenda (100);
		
		boolean salir=false;
		while (salir==false) {
			System.out.println("1 - Mostrar entradas");
			System.out.println("2 - Añadir entrada");
			System.out.println(" 3 - Modificar entrada");
			System.out.println("4 -  Borrar entrada");
			System.out.println("9 - Salir ");
			
			String opcion=teclado.nextLine();
			
			if(opcion.aquals("1")) {
				miAgenda.mostrarEntrada();
		}
			if(opcion.aquals("2")) {
				miAgenda.insertarEntrada();
			}
			
			if(opcion.aquals("9")) {
				salir=true;
				
			}
	}

}
