
public class Main {
	public static void main(String[] args) {
		// Primeiro criei dois jogadores, Luiz e Marcelo e o status pra depois poder chamar a função de modificar
		Jogador Jogador1 = new Jogador("Luiz");
		Jogador Jogador2 = new Jogador("Marcelo");
		StatusJogo status = StatusJogo.getInstance();
		
		// Após criar os jogadores, visualizei o status dos dois
		Jogador1.visualizarStatus();
		Jogador2.visualizarStatus();
		
		// Pra ter certeza, modifiquei o status
		status.mudarStatus("Chefão", 5, 4);
		
		// Visualizei os status dos dois jogadores novamente e verifiquei que os dois foram modificados
		Jogador1.visualizarStatus();
		Jogador2.visualizarStatus();
		
		// Criei um outro jogador e visualizei seu status e verifiquei que era igual dos outros dois
		Jogador Jogador3 = new Jogador("Glauco");
		Jogador3.visualizarStatus();
	}
}