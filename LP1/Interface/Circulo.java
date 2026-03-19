package LP1.Interface;

public class Circulo implements IForma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
