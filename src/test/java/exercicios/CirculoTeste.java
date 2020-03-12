package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    @Test
    public void criarObjetoCirculo() {
    Circulo c1 = new Circulo (6.0);
    assertNotNull(c1);
    }
    @Test
    public void presencaAtributoRaio() {
        Circulo c1 = new Circulo (6.0);
        assertNotNull(c1.getRaio());
    }
    @Test
    public void calcularArea() {
        Circulo c1 = new Circulo (6.00);
        Double valorEsperado = 113.09733552923255;
        Double valorObtido = c1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void calcularPerimetro() {
        Circulo c1 = new Circulo (6.0);
        Double valorEsperado = 37.69911184307752;
        Double valorObtido = c1.calcularPerimetro();
        assertEquals (valorEsperado, valorObtido);
    }
}