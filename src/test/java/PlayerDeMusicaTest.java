import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerDeMusicaTest {
    private PlayerDeMusica player;

    @BeforeEach
    public void setUp() {
        player = new PlayerDeMusica();
        player.setFaixaAtual("Faixa Inicial");
    }

    @Test
    public void deveTocarQuandoParado() {
        assertTrue(player.tocar());
        assertEquals("Tocando", player.getNomeEstado());
    }

    @Test
    public void naoDevePausarQuandoParado() {
        assertFalse(player.pausar());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void naoDevePararQuandoParado() {
        assertFalse(player.parar());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void naoDeveProximaQuandoParado() {
        assertFalse(player.proxima());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void naoDeveAnteriorQuandoParado() {
        assertFalse(player.anterior());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void devePausarQuandoTocando() {
        player.setEstado(EstadoTocando.getInstance());
        assertTrue(player.pausar());
        assertEquals("Pausado", player.getNomeEstado());
    }

    @Test
    public void devePararQuandoTocando() {
        player.setEstado(EstadoTocando.getInstance());
        assertTrue(player.parar());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void deveProximaQuandoTocando() {
        player.setEstado(EstadoTocando.getInstance());
        assertTrue(player.proxima());
        assertEquals("Faixa Inicial", player.getFaixaAtual());
    }

    @Test
    public void deveAnteriorQuandoTocando() {
        player.setEstado(EstadoTocando.getInstance());
        assertTrue(player.anterior());
        assertEquals("Faixa Inicial", player.getFaixaAtual());
    }

    @Test
    public void deveTocarQuandoPausado() {
        player.setEstado(EstadoPausado.getInstance());
        assertTrue(player.tocar());
        assertEquals("Tocando", player.getNomeEstado());
    }

    @Test
    public void devePararQuandoPausado() {
        player.setEstado(EstadoPausado.getInstance());
        assertTrue(player.parar());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void naoDeveProximaQuandoPausado() {
        player.setEstado(EstadoPausado.getInstance());
        assertFalse(player.proxima());
        assertEquals("Pausado", player.getNomeEstado());
    }

    @Test
    public void naoDeveAnteriorQuandoPausado() {
        player.setEstado(EstadoPausado.getInstance());
        assertFalse(player.anterior());
        assertEquals("Pausado", player.getNomeEstado());
    }

    @Test
    public void devePararQuandoAvancando() {
        player.setEstado(EstadoAvancando.getInstance());
        assertTrue(player.parar());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void deveTocarQuandoAvancando() {
        player.setEstado(EstadoAvancando.getInstance());
        assertTrue(player.tocar());
        assertEquals("Tocando", player.getNomeEstado());
    }

    @Test
    public void devePararQuandoRebobinando() {
        player.setEstado(EstadoRebobinando.getInstance());
        assertTrue(player.parar());
        assertEquals("Parado", player.getNomeEstado());
    }

    @Test
    public void deveTocarQuandoRebobinando() {
        player.setEstado(EstadoRebobinando.getInstance());
        assertTrue(player.tocar());
        assertEquals("Tocando", player.getNomeEstado());
    }
}
