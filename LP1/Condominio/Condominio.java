package LP1.Condominio;

import java.util.ArrayList;
import java.util.List;

public class Condominio {
    private String endereco;
    private Integer numero;
    private String construtora;
    private List<Bloco> bloco;

    public Condominio() {

    }

    public Condominio(String endereco, Integer numero, String construtora) {
        this.endereco = endereco;
        this.numero = numero;
        this.construtora = construtora;
        this.bloco = new ArrayList<>();
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

    public void setBloco(Bloco bloco) {
        this.bloco.add(bloco);
    }

    public void setBlocos(List<Bloco> blocos) {
        this.bloco = blocos;
    }

    public Bloco getBloco(int indice) {
        return this.bloco.get(indice);
    }

    public void delBloco(Bloco bloco) {
        this.bloco.remove(bloco);
    }
}
