package navegadorInternet;

public class NavegadorInternetFuncoes implements NavegadorInternet {

	public void adicionarnovaaba() {
		System.out.println("Nova aba aberta");
	}

	public void atualizarpagina() {
		System.out.println("Atualizando pagina");
	}

	public void exibirpagina() {
		String url = "";
		System.out.println("Exibindo pagina "+url);
	}

}
