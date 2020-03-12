package exercicios;

public class Circulo {
    public Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }
    public Double getRaio () {
        return raio;
    }
    public void setRaio (Double raio) {
        if (raio <= 0 ) {
            throw new IllegalArgumentException("O raio deve ser maior que 0");
        }
    }
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }
    public Double calcularPerimetro() {
        return raio * (2 * Math.PI);
    }
}