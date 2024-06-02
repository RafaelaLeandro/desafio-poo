package iPhone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	 
	private String url;
		public void setUrl(String url) {
		    this.url = url;
		  }
		  public String getUrl() {
		    return url;
		  }
		  
	private String musica;
		public void setMusica(String musica) {
		this.musica = musica;
		}
		public String getMusica() {
		return musica;
		}
	
	private String numero;
		public void setNumero(String numero) {
		this.numero = numero;
		}
		public String getNumero() {
			return numero;
		}

	
	public void adicionarnovaaba() {
		System.out.println("Nova aba aberta em IPhone");
	}

	public void atualizarpagina() {
		System.out.println("Pagina atualizada");
	}

	public void exibirpagina() {
		System.out.println("Exibindo pagina "+url+" em IPhone");
	}

	public void pausar() {
		System.out.println("Pausar música");
	}

	public void tocar() {
		System.out.println("Tocar musica em IPhone ");
	}

	public void selecionarmusica() {
		System.out.println("Musica "+musica+" selecionada em IPhone");
	}

	public void atender() {
		System.out.println("Atender IPhone");
	}

	public void correiovoz() {
		System.out.println("Ouvir correio de voz de IPhone");
	}

	public void ligar() {
		System.out.println("Ligar para "+numero+" pelo IPhone");
	}

	

}
