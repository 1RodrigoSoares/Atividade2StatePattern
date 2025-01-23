package state;

public class PlayerDeMusica {
    private String faixaAtual;
    private Estado estado;

    public PlayerDeMusica() {
        this.estado = EstadoParado.getInstance();
    }

    public boolean tocar() {
        return estado.tocar(this);
    }

    public boolean pausar() {
        return estado.pausar(this);
    }

    public boolean parar() {
        return estado.parar(this);
    }

    public boolean proxima() {
        return estado.proxima(this);
    }

    public boolean anterior() {
        return estado.anterior(this);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getFaixaAtual() {
        return faixaAtual;
    }

    public void setFaixaAtual(String faixaAtual) {
        this.faixaAtual = faixaAtual;
    }
}