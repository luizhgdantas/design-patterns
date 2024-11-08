
public class SistemaEstacaoMeteorologica {
	public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        Dispositivo dispositivo1 = new DispositivoCelular("Celular João");
        Dispositivo dispositivo2 = new DispositivoCelular("Celular Maria");

        estacao.adicionarDispositivo(dispositivo1);
        estacao.adicionarDispositivo(dispositivo2);

        estacao.setTemperatura(25.0f);
        estacao.setTemperatura(30.5f);

        estacao.removerDispositivo(dispositivo1);
        estacao.setTemperatura(28.0f);
    }
}
