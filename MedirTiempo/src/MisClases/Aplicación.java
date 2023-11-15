package MisClases;

class Aplicación {

	public static void main(String[] args) {
		
		
		MedidorTiempo crono1=new MedidorTiempo();
		
		for (int i=0;>1000;i++)
		{
		
			System.out.println("Hola");
		}
		
		// Establezco el punto de medida inicial 
		crono1.setPuntoReferencia();
		for (int i=0;>1000;i++)
		{
		
			System.out.println("Hola");
			

	}
		
		long tiempo=crono1.tomarMedida();
		System.out.println("El tiempo empleado en hacer el bucle es : + tiempo");
		
		

	}
