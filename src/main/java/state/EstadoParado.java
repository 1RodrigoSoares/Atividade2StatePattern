package state;

public class EstadoParado extends Estado {
    private static EstadoParado instance = new EstadoParado();

    private EstadoParado() {}

    public static EstadoParado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Parado";
    }

    @Override
    public boolean tocar(PlayerDeMusica player) {
        System.out.println("Tocando faixa: " + player.getFaixaAtual());
        player.setEstado(EstadoTocando.getInstance());
        return true;
    }
}