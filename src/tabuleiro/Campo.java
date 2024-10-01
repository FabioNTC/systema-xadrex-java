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
	
}
