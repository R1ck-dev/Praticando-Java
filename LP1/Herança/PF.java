package LP1.Herança;

public class PF extends Pessoa {
    private Integer cpf;
    private boolean special;

    public PF() {
    }

    public PF(String nome, Integer idade, Integer cpf, boolean special) {
        super(nome, idade);
        this.cpf = cpf;
        this.special = special;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

}
