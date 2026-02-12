package LP1.Aula1;

public class Pessoa {
    private int idade;
    private String nome;
    private int altura;

    public Pessoa() {}

    public Pessoa(int idade, String nome, int altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
