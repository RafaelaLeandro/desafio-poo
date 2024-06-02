package aparelhoUsuario;

import aparelhoTelefonico.AparelhoTelefonico;
import iPhone.IPhone;
import reprodutorMusical.ReprodutorMusical;

public class AparelhoUsuario {

	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		AparelhoTelefonico atender = iphone;
		ReprodutorMusical selecionarmusica = iphone;

		
		
		atender.atender();
		
		iphone.setMusica("Dingo Bell");
		selecionarmusica.selecionarmusica();

	}

}
