package xadrez;

import tabuleiro.Campo;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Campo campo;

	public PartidaXadrez() {
		campo = new Campo(8, 8);
		configInicial();
	}

	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[campo.getFileira()][campo.getLinha()];
		for (int i = 0; i < campo.getFileira(); i++) {
			for (int j = 0; j < campo.getLinha(); j++) {
				mat[i][j] = (PecaXadrez) campo.peca(i, j);
			}
		}
		return mat;
	}

	private void placeNewPiece(char fileira, int linha, PecaXadrez peca) {
		campo.campoPeca(peca, new PosicaoXadrez(fileira, linha).toPosicao());
	}

	private void configInicial() {
		placeNewPiece('c', 2, new Torre(campo, Cor.White));
		placeNewPiece('d', 2, new Torre(campo, Cor.White));
		placeNewPiece('e', 2, new Torre(campo, Cor.White));
		placeNewPiece('e', 1, new Torre(campo, Cor.White));
		placeNewPiece('d', 1, new Rei(campo, Cor.White));

		placeNewPiece('c', 7, new Torre(campo, Cor.Black));
		placeNewPiece('c', 8, new Torre(campo, Cor.Black));
		placeNewPiece('d', 7, new Torre(campo, Cor.Black));
		placeNewPiece('e', 7, new Torre(campo, Cor.Black));
		placeNewPiece('e', 8, new Torre(campo, Cor.Black));
		placeNewPiece('d', 8, new Rei(campo, Cor.Black));
	}
}
