package tabuleiro;

public class Posicao {
	
	private int fileira;
	private int linha;
	
	public Posicao(int fileira, int linha) {
		this.fileira = fileira;
		this.linha = linha;
	}
	
	public int getFileira() {
		return fileira;
	}
	public void setFileira(int fileira) {
		this.fileira = fileira;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	@Override
	public String toString() {
		return fileira + " " + linha;
	}
	
}
