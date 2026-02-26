package LP1.Condominio;

public class Bloco {
    private Integer numero;
    private String apelido;
    private Apartamento apartamento;

    public Bloco() {
    }

    public Bloco(Integer numero, String apelido, Apartamento apartamento) {
        this.numero = numero;
        this.apelido = apelido;
        this.apartamento = apartamento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }
}
