package xadrez.pecas;

import tabuleiro.Campo;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

	public Torre(Campo campo, Cor cor) {
		super(campo, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}
}
