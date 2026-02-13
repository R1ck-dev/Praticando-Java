package LP1.Aula1.ExeIMC;

import java.text.DecimalFormat;

public class Imc {
    private double peso;
    private double altura;

    DecimalFormat df = new DecimalFormat("0.00");

    public Imc() {
    }

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void calImc() {
        double imcOut = peso / (Math.pow(altura, 2));
        System.out.println(df.format(imcOut));
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
