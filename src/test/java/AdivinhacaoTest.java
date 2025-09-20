import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdivinhacaoTest {

    @Test
    public void testeTentarMaior() {
        Adivinhacao jogo = new Adivinhacao(1,30);
        jogo.setNumeroSecreto(15);
        assertEquals("maior", jogo.tentar(12));
    }


    @Test
    public void testeTentarMenor() {
        Adivinhacao jogo = new Adivinhacao(1,30);
        jogo.setNumeroSecreto(7);
        assertEquals("menor", jogo.tentar(13));
    }

    @Test
    public void testeTentarAcertou() {
        Adivinhacao jogo = new Adivinhacao(1,30);
        jogo.setNumeroSecreto(7);
        assertEquals("acertou", jogo.tentar(7));
    }

    @Test
    public void testeLImiteMinimo() {
        Adivinhacao jogo = new Adivinhacao(1,30);
        jogo.setNumeroSecreto(1);
        assertEquals("acertou", jogo.tentar(1));
    }

    @Test
    public void testeLImiteMaximo() {
        Adivinhacao jogo = new Adivinhacao(1,30);
        jogo.setNumeroSecreto(30);
        assertEquals("acertou", jogo.tentar(30));
    }
}