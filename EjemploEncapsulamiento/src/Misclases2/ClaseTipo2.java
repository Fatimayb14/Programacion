package Misclases2;

public class ClaseTipo2 {

	// Atributos
	private int atPrivado;
	public int atPublic;
	protected int atProtected;
	int atDefault;

	
		// Métodos
		
		public ClaseTipo2() {
			atPrivado=10;
			atPublic=11;
			atProtected=12;
			atDefault=13;
			  
			
		}
		
		private void metodoPrivado() {
			System.out.println("Valor de atPrivado es: " +  atPrivado);
			System.out.println("Valor de atPublic es: " + atPublic);
			System.out.println("Valor de atProtected es : " + atProtected);
			System.out.println("Valor de atDefault es : " + atDefault);
		}
		
		public 	void metodoPublico() {
			System.out.println("Valor de atPrivado es : + atPrivado");
			System.out.println("Valor de atPublic es : + atPublico");
			System.out.println("Valor de atProtected es : + atProtected");
			System.out.println("Valor de atDefault es : + atDefault");
		}
		
		protected void metodoProtected() {
			System.out.println("Valor de atPrivado es : + atPrivado");
			System.out.println("Valor de atPublic es : + atPublico");
			System.out.println("Valor de atProtected es : + atProtected");
			System.out.println("Valor de atDefault es : + atDefault");
		}
		
		
		void metodoDefault() {
			System.out.println("Valor de atPrivado es : + atPrivado");
			System.out.println("Valor de atPublic es : + atPublic");
			System.out.println("Valor de atProtected  es : + atProtected");
			System.out.println("Valor de atDefault es : + atDefault ");

		}

}
