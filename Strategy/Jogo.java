import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		UnidadeMilitar unidade1 = new UnidadeMilitar();
		int contadorAtaque = 0;
		
		System.out.println("Começando batalha");
		String opcao;
		
		//Tem duas formas de acabar o jogo, atacando 5 vezes o oponente ou utilizando a estratégia bandeira branca (desistindo)
	
		while(contadorAtaque <= 4) {
			System.out.println("------------------------------------------");
			System.out.println("Qual estratégia deseja utilizar?");
			System.out.println("1- Ofensiva: Ataca o oponente");
			System.out.println("2- Defensiva: Aumenta os pontos de defesa");
			System.out.println("3- Melhorar Ataque: Aumenta os pontos de ataque");
			System.out.println("4- Bandeira Branca: Desiste da luta");
			opcao = in.nextLine();
			
			if (opcao.equals("1")) {
				unidade1.setEstrategia(new EstrategiaOfensiva());
				unidade1.executarEstrategia();
				contadorAtaque++;
			}
			if (opcao.equals("2")) {
				unidade1.setEstrategia(new EstrategiaDefensiva());
				unidade1.executarEstrategia();
			}
			if (opcao.equals("3")) {
				unidade1.setEstrategia(new EstrategiaMelhorarAtaque());
				unidade1.executarEstrategia();
			}
			if (opcao.equals("4")) {
				unidade1.setEstrategia(new EstrategiaBandeiraBranca());
				unidade1.executarEstrategia();
				break;
			}
			
			try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            System.err.println("O thread foi interrompido!");
	        }
		}
		
		System.out.println("Fim da batalha");
	}
}
