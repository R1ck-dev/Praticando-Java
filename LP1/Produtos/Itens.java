package LP1.Produtos;

public class Itens {
    private int numItem;
    private int qtdItem;
    private Produto produto;

    public Itens() {
    }

    public Itens(int numItem, int qtdItem, Produto produto) {
        this.numItem = numItem;
        this.qtdItem = qtdItem;
        this.produto = produto;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
