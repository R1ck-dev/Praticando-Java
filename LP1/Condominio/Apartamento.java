package LP1.Condominio;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {
    private Integer andar;
    private Integer numero;
    private Boolean cobertura;
    private List<Morador> morador;

    public Apartamento() {
    }

    public Apartamento(Integer andar, Integer numero, Boolean cobertura) {
        this.andar = andar;
        this.numero = numero;
        this.cobertura = cobertura;
        this.morador = new ArrayList<>();
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

    public Morador getMorador(int indice) {
        return this.morador.get(indice);
    }

    public void setMorador(Morador morador) {
        this.morador.add(morador);
    }

    public void setMoradores(List<Morador> moradores) {
        this.morador = moradores;
    }

    public void delMorador(Morador morador) {
        this.morador.remove(morador);
    }
}