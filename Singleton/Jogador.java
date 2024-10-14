
public class Jogador {
	private String nome;
	private StatusJogo status;
	
	public Jogador(String nome) {
        this.nome = nome;
        this.status = StatusJogo.getInstance();
    }
	
	public void visualizarStatus() {
		System.out.println("Satus do jogador " + this.nome);
		status.mostrarStatus();
	}
}