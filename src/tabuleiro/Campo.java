package tabuleiro;

public class Campo {
	
	private int fileiras;
	private int linhas;
	private Peca[][] pecas;
	
	public Campo(int fileira, int linha) {
		if (fileira < 1 || linha < 1) {
			throw new ExcecaoCampo("Erro criando tabuleiro: é necessário pelo menos 1 linha e 1 coluna");
		}
		this.fileiras = fileira;
		this.linhas = linha;
		pecas = new Peca [fileira][linha];
	}

	public int getFileira() {
		return fileiras;
	}

	public int getLinha() {
		return linhas;
	}
	
	public Peca peca(int fileira, int linha) {
		if (!posicaoExistente(fileira, linha)) {
			throw new ExcecaoCampo("Posição não existe no tabuleiro.");
		}
		return pecas[fileira][linha];
	}
	
	public Peca peca(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoCampo("Posição não existe no tabuleiro.");
		}
		return pecas[posicao.getFileira()][posicao.getLinha()];
	}
	
	public void campoPeca(Peca peca, Posicao posicao) {
		if (aUmaPecaAqui(posicao)) {
			throw new ExcecaoCampo("Existe uma peça na posição " + posicao);
		}
		pecas[posicao.getFileira()][posicao.getLinha()] = peca;
		peca.posicao = posicao;
		
	}
	
	private boolean posicaoExistente(int fileira, int linha) {
		return fileira >= 0 && fileira < fileiras  && linha >= 0 && linha < linhas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getFileira(), posicao.getLinha());
	}
	
	public boolean aUmaPecaAqui(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoCampo("Posição não existe no tabuleiro.");
		}
		return peca(posicao) != null;
	}
}
