package tabuleiro;

public class Campo {
	
	private int fileiras;
	private int colunas;
	private Peca[][] pecas;
	
	public Campo(int fileira, int coluna) {
		if (fileira < 1 || coluna < 1) {
			throw new ExcecaoCampo("Erro criando tabuleiro: é necessário pelo menos 1 linha e 1 coluna");
		}
		this.fileiras = fileira;
		this.colunas = coluna;
		pecas = new Peca [fileira][coluna];
	}

	public int getFileira() {
		return fileiras;
	}

	public int getColuna() {
		return colunas;
	}
	
	public Peca peca(int fileira, int coluna) {
		if (!posicaoExistente(fileira, coluna)) {
			throw new ExcecaoCampo("Posição não existe no tabuleiro.");
		}
		return pecas[fileira][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoCampo("Posição não existe no tabuleiro.");
		}
		return pecas[posicao.getFileira()][posicao.getColuna()];
	}
	
	public void campoPeca(Peca peca, Posicao posicao) {
		if (aUmaPecaAqui(posicao)) {
			throw new ExcecaoCampo("Existe uma peça na posição " + posicao);
		}
		pecas[posicao.getFileira()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
		
	}
	
	private boolean posicaoExistente(int fileira, int coluna) {
		return fileira >= 0 && fileira < fileiras && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getFileira(), posicao.getColuna());
	}
	
	public boolean aUmaPecaAqui(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoCampo("Posição não existe no tabuleiro.");
		}
		return peca(posicao) != null;
	}
}
