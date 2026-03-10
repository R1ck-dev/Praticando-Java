package LP1.HerancaAssociacao;

public class Pedido {
    private Integer codigo;
    private String dataPedido;
    private Integer quantidade;

    public Pedido() {
    }

    public Pedido(Integer codigo, String dataPedido, Integer quantidade) {
        this.codigo = codigo;
        this.dataPedido = dataPedido;
        this.quantidade = quantidade;
    }

    public Double calcValorTotal(Produto produto, Integer quantidade) {
        if (produto instanceof Permanente) {
            Permanente produtoPermanente = (Permanente) produto;
            return (produtoPermanente.getValorUnit() * quantidade) * produtoPermanente.getPercDesvalorizacao();
        } else {
            Perecivel produtoPerecivel = (Perecivel) produto;
            return produtoPerecivel.getValorUnit() * quantidade;
        }
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
