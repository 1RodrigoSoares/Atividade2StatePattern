package state;


public class EstadoTocando extends Estado {
    private static EstadoTocando instance = new EstadoTocando();

    private EstadoTocando() {}

    public static EstadoTocando getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Tocando";
    }

    @Override
    public boolean pausar(PlayerDeMusica player) {
        System.out.println("Pausando faixa: " + player.getFaixaAtual());
        player.setEstado(EstadoPausado.getInstance());
        return true;
    }

    @Override
    public boolean parar(PlayerDeMusica player) {
        System.out.println("Parando reprodução.");
        player.setEstado(EstadoParado.getInstance());
        return true;
    }

    @Override
    public boolean proxima(PlayerDeMusica player) {
        System.out.println("Pulando para a próxima faixa.");
        return true;
    }

    @Override
    public boolean anterior(PlayerDeMusica player) {
        System.out.println("Voltando para a faixa anterior.");
        return true;
    }
}