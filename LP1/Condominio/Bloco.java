package LP1.Condominio;

import java.util.ArrayList;
import java.util.List;

public class Bloco {
    private Integer numero;
    private String apelido;
    private List<Apartamento> apartamento;

    public Bloco(Integer numero, String apelido) {
        this.numero = numero;
        this.apelido = apelido;
        this.apartamento = new ArrayList<>();
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

    public void setApartamento(Apartamento apartamento) {
        this.apartamento.add(apartamento);
    }

    public void setApartamentos(List<Apartamento> apartementos) {
        this.apartamento = apartementos;
    }

    public Apartamento getApartamento(int indice) {
        return this.apartamento.get(indice);
    }

    public void delApartamento(Apartamento apartamento) {
        this.apartamento.remove(apartamento);
    }

}
