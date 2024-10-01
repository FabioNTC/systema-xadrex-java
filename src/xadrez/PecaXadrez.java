package xadrez;

import tabuleiro.Campo;
import tabuleiro.Peca;

public class PecaXadrez extends Peca{
	
	private Cor cor;

	public PecaXadrez(Campo campo, Cor cor) {
		super(campo);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
}
