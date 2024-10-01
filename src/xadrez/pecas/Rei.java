package xadrez.pecas;

import tabuleiro.Campo;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez{

	public Rei(Campo campo, Cor cor) {
		super(campo, cor);
	}
	@Override
	public String toString() {
		return "R";
	}
}
