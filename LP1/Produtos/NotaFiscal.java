package LP1.Produtos;

// import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private int numNota;
    private String dataImpressao;
    private String obsNota;
    private List<Itens> itens;

    public NotaFiscal(int numNota, String dataImpressao, String obsNota, List<Itens> itens) {
        this.numNota = numNota;
        this.dataImpressao = dataImpressao;
        this.obsNota = obsNota;
        // this.itens = new ArrayList<Itens>();
        this.itens = itens;
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        this.numNota = numNota;
    }

    public String getDataImpressao() {
        return dataImpressao;
    }

    public void setDataImpressao(String dataImpressao) {
        this.dataImpressao = dataImpressao;
    }

    public String getObsNota() {
        return obsNota;
    }

    public void setObsNota(String obsNota) {
        this.obsNota = obsNota;
    }

    public List<Itens> getItems() {
        return itens;
    }

    public void setItem(Itens item) {
        this.itens.add(item);
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public Itens getItem(int indice) {
        return this.itens.get(indice);
    }

    public void delItem(Itens item) {
        this.itens.remove(item);
    }

}
