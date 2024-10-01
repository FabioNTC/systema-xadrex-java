package tabuleiro;

public class Campo {
	
	private int fileira;
	private int coluna;
	private Peca[][] pecas;
	
	public Campo(int fileira, int coluna) {
		this.fileira = fileira;
		this.coluna = coluna;
		pecas = new Peca [fileira][coluna];
	}

	public int getFileira() {
		return fileira;
	}

	public void setFileira(int fileira) {
		this.fileira = fileira;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public Peca peca(int fileira, int coluna) {
		return pecas[fileira][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getFileira()][posicao.getColuna()];
	}
	
	public void campoPeca(Peca peca, Posicao posicao) {
		pecas[posicao.getFileira()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
}
