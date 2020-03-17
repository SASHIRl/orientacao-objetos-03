package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    @Test
    public void criarObjetoCorrentista () {
        Correntista c1 = new Correntista("SP3032175", "Diego", "diego.ifsp@dududueedu.com", 40028922);
        assertNotNull(c1);
    }
    @Test
    public void presencaAtributos () {
        Correntista c1 = new Correntista("SP3032175", "Diego", "diego.ifsp@dududueedu.com", 40028922);
        assertEquals("SP3032175", c1.getCodigo());
        assertEquals("Diego", c1.getNome());
        assertEquals("diego.ifsp@dududueedu.com", c1.getEmail());
        assertEquals (40028922, c1.getTelefone());
    }
}
