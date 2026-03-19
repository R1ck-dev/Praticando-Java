package LP1.Interface;

public class Trapezio implements IForma {

    private double bMaior;
    private double bMenor;
    private double altura;

    public Trapezio() {
    }

    public Trapezio(double bMaior, double bMenor, double altura) {
        this.bMaior = bMaior;
        this.bMenor = bMenor;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return ((bMaior + bMenor) * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return bMaior + bMenor + (altura * 2);
    }

    public double getbMaior() {
        return bMaior;
    }

    public void setbMaior(double bMaior) {
        this.bMaior = bMaior;
    }

    public double getbMenor() {
        return bMenor;
    }

    public void setbMenor(double bMenor) {
        this.bMenor = bMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
