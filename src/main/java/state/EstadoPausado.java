package state;

public class EstadoPausado extends Estado {
    private static EstadoPausado instance = new EstadoPausado();

    private EstadoPausado() {}

    public static EstadoPausado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pausado";
    }

    @Override
    public boolean tocar(PlayerDeMusica player) {
        System.out.println("Retomando faixa: " + player.getFaixaAtual());
        player.setEstado(EstadoTocando.getInstance());
        return true;
    }

    @Override
    public boolean parar(PlayerDeMusica player) {
        System.out.println("Parando reprodução.");
        player.setEstado(EstadoParado.getInstance());
        return true;
    }
}