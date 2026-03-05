package LP1.Herança;

public class PJ extends Pessoa {
    private Integer cnpj;
    private String razao;

    public PJ() {
    }

    public PJ(String nome, Integer idade) {
        super(nome, idade);
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    
}
