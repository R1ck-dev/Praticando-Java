package LP1.Condominio;

public class Morador {
    private String nome;
    private Integer idade;
    private Boolean resp;
    
    public Morador() {
    }

    public Morador(String nome, Integer idade, Boolean resp) {
        this.nome = nome;
        this.idade = idade;
        this.resp = resp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Boolean getResp() {
        return resp;
    }

    public void setResp(Boolean resp) {
        this.resp = resp;
    }

    
}
