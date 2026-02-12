package LP1.Aula1;

public class Computador {
    private String marca; 
    private String modelo; 
    private String processador; 
    private int memoriaRAM; 
    private int capacidadeArmazenamento; 
    private double preco; 
    private boolean ehNotebook;
    
    public Computador() {
    }

    public Computador(String marca, String modelo, String processador, int memoriaRAM, int capacidadeArmazenamento,
            double preco, boolean ehNotebook) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.preco = preco;
        this.ehNotebook = ehNotebook;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEhNotebook() {
        return ehNotebook;
    }

    public void setEhNotebook(boolean ehNotebook) {
        this.ehNotebook = ehNotebook;
    }

    
}
