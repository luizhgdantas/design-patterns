import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {
	private List<Dispositivo> dispositivos = new ArrayList<>();
    private float temperatura;

    public void adicionarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void removerDispositivo(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }

    public void notificarDispositivos() {
        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.atualizar(temperatura);
        }
    }

    public void setTemperatura(float novaTemperatura) {
        this.temperatura = novaTemperatura;
        System.out.println("Estação Meteorológica: Temperatura atualizada para " + temperatura + "°C");
        notificarDispositivos();
    }
}
