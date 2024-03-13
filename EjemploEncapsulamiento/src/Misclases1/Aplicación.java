package Misclases1;

import Misclases2.ClaseTipo2;

public class Aplicación {

	public static void main(String[] args) {
		 
		ClaseTipo1 ob1=new ClaseTipo1();
		  
		// Acceso a atributos y métodos public
		ob1.atPublic=100;
		ob1.metodoPublic();
		
		
		// Acceso a atributos y métodos protected
		ob1.atProtected=100;
		ob1.metodoProtected();
		
		
		// Acceso a atributos y métodos default 
		ob1.atDefault=100;
		ob1.metodoDefault();
		
		// Acceso a atributos y métodos private
//		ob1.atPrivate=100     //  no puedo porque es private
//		ob1.metodoPrivate();   // No puedo porque es private 
		
		// Para poder invocar al constructor tengo que hacerle public por estar
		// En paquetes distintos 
		ClaseTipo2 ob2=new ClaseTipo2() ;
		
		// Acceso a atributos y métodos public
		ob2.atPublic=100;
		ob2.metodoPublico();
				
				
				// Acceso a atributos y métodos protected
//				ob2.atProtected=100;
//				ob2.metodoProtected();
				
				
				// Acceso a atributos y métodos default 
//				ob2.atDefault=100;
//				ob2.metodoDefault();
				
				
	
	
		
		// Acceso a atributos y metodos protected 
					// ob2.atProteted=100; No puedo acceder por estar en paquetes
					//Distintos y no tener herencias entre objetos
					//ob2.metodoProtected();  No puedo acceder por estar en paquetes 
					// Distintos y no tener herencias entre objetos 
		// Acceso a atributos y metodos Default
					// ob2.atDefault=100; No puedo acceder por estar en paquetes
					//Distintos y no tener herencias entre objetos
					//ob2.metodoProtected();  No puedo acceder por estar en paquetes 
					// Distintos y no tener herencias entre objetos 
		// Acceso a atributos y metodos Public
					// ob2.atDefault=100; No puedo acceder por estar en paquetes
	
					//ob2.metodoPrivate();  No puedo acceder porque es privado
		
	
	}
}
