package Lista01_Exe01;

public class Fatura {
	private String numero;
	private String descricao;
	private int qtdItem;
	private double precoItem;
	private double valorFatura;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdItem() {
		return qtdItem;
	}
	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getValorFatura(){
		if(this.precoItem < 0){
			this.precoItem = 0;
		}
		this.valorFatura = this.precoItem * this.qtdItem;
		return valorFatura;
	}
	
	
}
