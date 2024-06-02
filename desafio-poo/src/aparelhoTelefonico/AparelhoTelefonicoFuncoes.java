package aparelhoTelefonico;

public class AparelhoTelefonicoFuncoes implements AparelhoTelefonico {
	
		public void atender() {
			System.out.println("Atender chamada");
		}
	

		public void correiovoz() {
			System.out.println("Ouvir correio de voz");
		}
	

		public void ligar() {
			String numero = "";
			System.out.println("Ligar para "+numero);
		}
	
}
