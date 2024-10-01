package xadrez;

import tabuleiro.Campo;
import tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Campo campo;
	
	public PartidaXadrez() {
		campo = new Campo(8, 8);
		configInicial();
	}
	
	public PecaXadrez[][] getPecas (){
		PecaXadrez[][] mat = new PecaXadrez[campo.getFileira()][campo.getColuna()];
		for (int i=0; i<campo.getFileira(); i++) {
			for (int j=0; j<campo.getColuna(); j++) {
				mat[i][j] = (PecaXadrez) campo.peca(i, j);
			}
		}
		return mat;
	}
	
	private void configInicial() {
		campo.campoPeca(new Torre(campo, Cor.White), new Posicao (2, 1));
		campo.campoPeca(new Rei(campo, Cor.Black), new Posicao (0, 4));
		campo.campoPeca(new Rei(campo, Cor.White), new Posicao (7, 4));
	}
}
