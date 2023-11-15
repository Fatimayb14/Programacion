package MisClases;

public class MedidorTiempo {
	
	// Atributos
	
	long  puntoReferencia;
	long  ultimaMedidad;
	
	// Métodos 
	
	
	// Constructor 
	MedidorTiempos(){
		ultimaMedida=0;
		puntoReferencia=System.currentTimeMillis();
		
	}
	
	long tomarMedida() {
		long tiempo;
		
		tiempo = System.currentTimeMillis() - puntoReferencia;
		
		ultimaMedida=tiempo;
		return tiempo;
		
		
		long devolverUltimaMedida() {
			return ultimaMedida;
			
		}
		
		 devolverUltimaMedidaSegundos() {
			 
			 // OJO CON EL DETALLE DE LA DIVISIÓN ENTERA. TIENE QUE SER 1000.0
			 return ultimaMedida/1000;
			 
		 }
	}

}
