import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConquistaTest {

    Conquista conquista;
    Missao missao;

    @BeforeEach
    void setUp() {
        conquista = new Conquista();
        missao = new Missao (15, 3);
    }

    @Test
    void deveAbrirMissao() {
        Trabalho aberturaMissao = new IniciodeMissaoTrabalho(missao);
        conquista.executarTarefa(aberturaMissao);

        assertEquals("Missao iniciada", missao.getDificuldade());
    }

}