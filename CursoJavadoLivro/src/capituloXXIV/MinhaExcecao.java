package capituloXXIV;

public class MinhaExcecao extends Exception {
	public String getMessage() {
		String mensagem = "Esse � o erro da exce��o customizada do "
				+ "Cap�tulo V! \nOcorreu porque foi clicado o bot�o "
				+ " Salvar mas o campo Nome estava em branco";
		return mensagem;
	}

}
