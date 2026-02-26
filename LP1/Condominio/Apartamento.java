package LP1.Condominio;

public class Apartamento {
    private Integer andar;
    private Integer numero;
    private Boolean cobertura;
    private Morador morador;

    public Apartamento() {
    }

    public Apartamento(Integer andar, Integer numero, Boolean cobertura, Morador morador) {
        this.andar = andar;
        this.numero = numero;
        this.cobertura = cobertura;
        this.morador = morador;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean getCobertura() {
        return cobertura;
    }

    public void setCobertura(Boolean cobertura) {
        this.cobertura = cobertura;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
}