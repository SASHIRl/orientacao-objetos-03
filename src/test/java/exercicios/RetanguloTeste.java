package exercicios;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
    @Test
    public void criarObjetoRetangulo () {
        Retangulo r1 = new Retangulo(10.00, 20.00);
        assertNotNull(r1);
    }
    @Test
    public void presencaAtributos () {
        Retangulo r1 = new Retangulo (10.00, 20.00);
        assertEquals (10.0, r1.getBase());
        assertEquals (20.0, r1.getAltura());
    }
    @Test
    public void calcularArea () {
        Retangulo r1 = new Retangulo(10.0, 20.0);
        Double valorEsperado = 200.0;
        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void calcularPerimetro () {
        Retangulo r1 = new Retangulo(10.00,20.00);
        Double valorEsperado = 60.00;
        Double valorObtido = r1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}