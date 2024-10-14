
public class StatusJogo {
	private static StatusJogo instance;
	public String faseAtual;
	public int inimigosVivos;
	public int tentativas; //Quantas vezes os jogadores já tentaram passar a fase, mas falharam (morrendo, por exemplo)
	
	private StatusJogo() {
        this.faseAtual = "Fase Final";
        this.inimigosVivos = 15;
        this.tentativas = 3;
    }

    public static StatusJogo getInstance() {
        if (instance == null) {
            instance = new StatusJogo();
        }
        return instance;
    }
    
    public void mostrarStatus() {
        System.out.println("Fase atual: " + this.faseAtual);
        System.out.println("Inimigos vivos: " + this.inimigosVivos);
        System.out.println("Tetnativas: " + this.tentativas);
    }
    
    public void mudarStatus(String faseAtual, int inimigosVivos, int tentativas) {
    	this.faseAtual = faseAtual;
        this.inimigosVivos = inimigosVivos;
        this.tentativas = tentativas;
    }
}