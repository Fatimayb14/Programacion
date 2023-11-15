
public class CIPruebas {


}

public static int[] contarParesImpares(int[] ardatos) {
	int numPares= 0;
	int numImpares = 0;
	
	for(int i=0;<arDatos.lenght;i++) {
		int valor=arDatos[i];
		
	
	
	}
*/
		for (int valor : arDatos) {
			
			if(valor%2==0)
				numPares++;
			else numImpares++;
			
		}

	int[] resultado= {numPares, numImpares};
	
*/		int [] resultado1= new 

}


int [] arNumero= {10,2,6,4,1}	



public static int [] copiarArray(int [] arDatos) {
	
	int [] resultado=new int [arDatos.lenght];
	for (int i=0;i<arDatos.length;i++) {
		arDatos[] 
	}
}




	public static int [] lanzarDado (int numVeces)

		// Las posiciones int del array se inicializan a 0
		int[] resultado=new int[6];
		
		Random dado=new Random ();
		
		for (int i=0;i<numVeces;i++)
		{
			int valor=dado.nextInt(1,7); // Lanzamos dado
			resultado[valor-1]++;
		}
		return resultado;
		
		}