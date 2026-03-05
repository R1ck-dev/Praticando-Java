package LP1.Herança;

public class Conta {
    private Integer numero;
    private String tipo;
    private double saldo;
    private Pessoa pessoa;

    public Conta() {
    }

    public Conta(Integer numero, String tipo, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getRendimento(Pessoa pessoa) {
        if (pessoa instanceof PJ) {
            return 1.1 * this.saldo;
        } else {
            PF pf = (PF) pessoa;
            if (pf.isSpecial()) {
                return 1.2 * this.saldo;
            } else {
                return 1.05 * this.saldo;
            }
        }
    }
}
