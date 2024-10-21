package xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {
	
	private char fileira;
	private int linha;
	
	public PosicaoXadrez(char fileira, int linha) {
		if (fileira < 'a' || fileira > 'h' || linha < 1 || linha > 8) {
			throw new ExcecaoXadrez("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.fileira = fileira;
		this.linha = linha;
	}

	public char getFileira() {
		return fileira;
	}

	public int getLinha() {
		return linha;
	}
	
	protected Posicao toPosicao() {
		return new Posicao (8 - linha, fileira - 'a');
	}
	
	protected static PosicaoXadrez fromPosicao (Posicao posicao) {
		return new PosicaoXadrez ((char)('a' - posicao.getFileira()), 8 - posicao.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + fileira + linha;
	}
}
