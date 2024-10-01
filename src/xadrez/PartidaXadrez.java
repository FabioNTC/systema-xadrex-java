package xadrez;

import tabuleiro.Campo;

public class PartidaXadrez {
	
	private Campo campo;
	
	public PartidaXadrez() {
		campo = new Campo(8, 8);
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
}
