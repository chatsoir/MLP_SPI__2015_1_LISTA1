package Lista01_Exe01;

public class Inicio {

	public static void main(String[] args) {
		
		Fatura f = new Fatura();
		
		f.setNumero("1");
		f.setDescricao("Placa de Video");
		f.setQtdItem(2);
		f.setPrecoItem(-300);
		
		System.out.printf("Descrição da compra: %n%nCodigo Produto: %s%nDescrição: %s%n"
				+ "Quantidade: %d%nValor: R$ %.2f%nValor Total: R$ %.2f%n"
				,f.getNumero(),f.getDescricao(),f.getQtdItem(),f.getPrecoItem(),f.getValorFatura());
		

	}

}
