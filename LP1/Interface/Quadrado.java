package LP1.Interface;

public class Quadrado implements IForma {

    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
