package state;

public class EstadoAvancando extends Estado {
    private static EstadoAvancando instance = new EstadoAvancando();

    private EstadoAvancando() {}

    public static EstadoAvancando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Avançando";
    }

    @Override
    public boolean parar(PlayerDeMusica player) {
        System.out.println("Parando avanço.");
        player.setEstado(EstadoParado.getInstance());
        return true;
    }

    @Override
    public boolean tocar(PlayerDeMusica player) {
        System.out.println("Voltando a tocar normalmente.");
        player.setEstado(EstadoTocando.getInstance());
        return true;
    }
}