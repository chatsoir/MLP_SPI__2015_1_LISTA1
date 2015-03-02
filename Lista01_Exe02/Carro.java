package Lista01_Exe02;

public class Carro {
	private String cor;
	private String modelo;
	private String comportamento;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public String getComportamento(){
		return comportamento;
	}
	public void setComportamento(String comportamento){
		this.comportamento = comportamento;
	}
	
	public void ligar(String ligar){
		if (ligar.equals("S")){
			this.setComportamento("Ferrari Ligada");
		}else{
			this.setComportamento("Ferrari Desligada");
		}
	}	
	
	public void acelerar(int kmPorHora){
		this.setVelocidadeAtual(kmPorHora);
		if(this.getVelocidadeAtual() > this.getVelocidadeMaxima()){
			System.out.printf("A velocidade maxima suportada é de: %d "
					+ "Km/h foi superada - Risco de Superaquecimento%n ", this.getVelocidadeMaxima());
		}
	}
}
