package capituloXXIV;

public class MinhaExcecao extends Exception {
	public String getMessage() {
		String mensagem = "Esse é o erro da exceção customizada do "
				+ "Capítulo V! \nOcorreu porque foi clicado o botão "
				+ " Salvar mas o campo Nome estava em branco";
		return mensagem;
	}

}
