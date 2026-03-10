package LP1.HerancaAssociacao;

public class Produto {
    private Integer codigo;
    private String descricao;
    private Double valorUnit;

    public Produto() {
    }

    public Produto(Integer codigo, String descricao, double valorUnit) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnit = valorUnit;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

}