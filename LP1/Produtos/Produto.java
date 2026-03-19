package LP1.Produtos;

public class Produto {
    private int codProduto;
    private String descProduto;
    private Double valorUnit;
    
    public Produto() {
    }

    public Produto(int codProduto, String descProduto, Double valorUnit) {
        this.codProduto = codProduto;
        this.descProduto = descProduto;
        this.valorUnit = valorUnit;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    
}
