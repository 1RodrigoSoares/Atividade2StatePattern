package state;

abstract class Estado {
    public abstract String getEstado();

    public boolean tocar(PlayerDeMusica player) {
        return false;
    }

    public boolean pausar(PlayerDeMusica player) {
        return false;
    }

    public boolean parar(PlayerDeMusica player) {
        return false;
    }

    public boolean proxima(PlayerDeMusica player) {
        return false;
    }

    public boolean anterior(PlayerDeMusica player) {
        return false;
    }
}