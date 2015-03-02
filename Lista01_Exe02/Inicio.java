package Lista01_Exe02;

import java.util.*;
public class Inicio {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String ligar = "N";
		Carro c = new Carro();
		
		c.setVelocidadeMaxima(250);
		c.setCor("Vermelho");
		c.setModelo("F250");
		c.ligar(ligar);
		System.out.printf("Teste com prototipo Ferrari%nModelo: %s%nCor: %s%nVelocidade Maxima: %d Km/h%n",c.getModelo(), c.getCor(),c.getVelocidadeMaxima());
		System.out.println();
		System.out.println("Deseja Ligar a Ferrari? (S ou N)");
		ligar = read.nextLine();
		
		if (ligar.equals("S")){
			c.ligar(ligar);
			System.out.println(c.getComportamento());
			
			System.out.println("Qual a velocidade neste momento?");
			int kmPorHora = read.nextInt();
			c.acelerar(kmPorHora);
			System.out.printf("Sua velocidade atual é: %d Km/h%n", c.getVelocidadeAtual());
			for (;true;){								
				
				System.out.println("Qual a velocidade agora?");
				kmPorHora = read.nextInt();
				c.acelerar(kmPorHora);				
				
				System.out.printf("Sua velocidade atual é: %d Km/h%n", c.getVelocidadeAtual());
				if (kmPorHora == 0){
					System.out.println("Deseja manter a Ferrari ligada? (S ou N)");
					ligar = read.next();
					
					if (ligar.equals("N")){
						c.ligar(ligar);
						break;
					}					
				}
			}			
			
		}
		System.out.println(c.getComportamento());
		
		read.close();
	}
	

}
