package LP1.HerancaAssociacao;

public class Perecivel extends Produto {
    private String dataValidade;
    private String cidadeOrigem;

    public Perecivel() {

    }

    public Perecivel(String dataValidade, String cidadeOrigem) {
        this.dataValidade = dataValidade;
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

}
