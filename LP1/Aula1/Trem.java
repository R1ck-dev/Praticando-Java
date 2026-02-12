package LP1.Aula1;

public class Trem {
    private String numeroSerie;        
    private String operadora;          
    private String tipoCombustivel;    
    private int quantidadeVagoes;      
    private int capacidadePassageiros; 
    private double velocidadeMaxima;   
    private boolean emMovimento;
    
    public Trem() {
    }

    public Trem(String numeroSerie, String operadora, String tipoCombustivel, int quantidadeVagoes,
            int capacidadePassageiros, double velocidadeMaxima, boolean emMovimento) {
        this.numeroSerie = numeroSerie;
        this.operadora = operadora;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeVagoes = quantidadeVagoes;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.emMovimento = emMovimento;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadeVagoes() {
        return quantidadeVagoes;
    }

    public void setQuantidadeVagoes(int quantidadeVagoes) {
        this.quantidadeVagoes = quantidadeVagoes;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }

    public void setEmMovimento(boolean emMovimento) {
        this.emMovimento = emMovimento;
    }
    
    
}
