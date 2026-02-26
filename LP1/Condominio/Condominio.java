package LP1.Condominio;

public class Condominio {
    private String endereco;
    private Integer numero;
    private String construtora;
    private Bloco bloco;

    public Condominio() {

    }

    public Condominio(String endereco, Integer numero, String construtora) {
        this.endereco = endereco;
        this.numero = numero;
        this.construtora = construtora;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getConstrutora() {
        return construtora;
    }

    public void setConstrutora(String construtora) {
        this.construtora = construtora;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }    
}
