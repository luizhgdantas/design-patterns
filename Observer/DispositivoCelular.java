
public class DispositivoCelular implements Dispositivo {
	private String nome;

    public DispositivoCelular(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(float temperatura) {
        System.out.println(nome + " recebeu atualização de temperatura: " + temperatura + "°C");
    }
}
