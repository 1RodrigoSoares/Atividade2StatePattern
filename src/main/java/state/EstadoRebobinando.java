package state;

public class EstadoRebobinando extends Estado {
    private static EstadoRebobinando instance = new EstadoRebobinando();

    private EstadoRebobinando() {}

    public static EstadoRebobinando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Rebobinando";
    }

    @Override
    public boolean parar(PlayerDeMusica player) {
        System.out.println("Parando rebobinagem.");
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