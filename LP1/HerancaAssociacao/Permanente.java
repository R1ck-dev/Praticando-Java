package LP1.HerancaAssociacao;

public class Permanente extends Produto {
    private Double percDesvalorizacao;
    private boolean escritorio;

    public Permanente() {

    }

    public Permanente(Double percDesvalorizacao, boolean escritorio) {
        this.percDesvalorizacao = percDesvalorizacao;
        this.escritorio = escritorio;
    }

    public Double getPercDesvalorizacao() {
        return percDesvalorizacao;
    }

    public void setPercDesvalorizacao(Double percDesvalorizacao) {
        this.percDesvalorizacao = percDesvalorizacao;
    }

    public boolean isEscritorio() {
        return escritorio;
    }

    public void setEscritorio(boolean escritorio) {
        this.escritorio = escritorio;
    }

}
