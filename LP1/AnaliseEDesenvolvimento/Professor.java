package LP1.AnaliseEDesenvolvimento;

public class Professor {
    private String prontuario;
    private String nome;
    private String email;
    private String password;

    public Professor() {
    }

    public Professor(String prontuario, String nome, String email, String password) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
