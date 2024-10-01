package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Campo campo;
	
	public Peca(Campo campo) {
		this.campo = campo;
		posicao = null;
	}

	protected Campo getCampo() {
		return campo;
	}
	
}
