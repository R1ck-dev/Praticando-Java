package LP1.Condominio;

public class Main {
    public static void main(String[] args) {
        Morador morador1 = new Morador("Henrique", 22, true);
        Morador morador2 = new Morador("Lucas", 21, false);

        Apartamento apto1 = new Apartamento(4, 42, false);
        apto1.setMorador(morador1);
        apto1.setMorador(morador2);

        Apartamento aptoCobertura = new Apartamento(10, 101, true);

        Bloco blocoA = new Bloco(1, "Bloco das Águas");
        blocoA.setApartamento(apto1);
        blocoA.setApartamento(aptoCobertura);

        Condominio condominio = new Condominio("Rua Nova, Centro - Salto", 300, "Construtora Confiança");
        condominio.setBloco(blocoA);

        System.out.println("=== DADOS DO CONDOMÍNIO ===");
        System.out.println("Endereço: " + condominio.getEndereco() + ", Nº " + condominio.getNumero());
        System.out.println("Construtora: " + condominio.getConstrutora());

        Bloco blocoRecuperado = condominio.getBloco(0);
        System.out.println("\n--- Bloco: " + blocoRecuperado.getApelido() + " (Nº " + blocoRecuperado.getNumero() + ") ---");

        Apartamento aptoRecuperado = blocoRecuperado.getApartamento(0);
        System.out.println("Apartamento " + aptoRecuperado.getNumero() + " | Andar: " + aptoRecuperado.getAndar());
        System.out.println("É cobertura? " + (aptoRecuperado.getCobertura() ? "Sim" : "Não"));

        System.out.println("\nMoradores do Apto " + aptoRecuperado.getNumero() + ":");
        Morador m1 = aptoRecuperado.getMorador(0);
        Morador m2 = aptoRecuperado.getMorador(1);
        
        System.out.println("- " + m1.getNome() + ", Idade: " + m1.getIdade() + " (Responsável: " + (m1.getResp() ? "Sim" : "Não") + ")");
        System.out.println("- " + m2.getNome() + ", Idade: " + m2.getIdade() + " (Responsável: " + (m2.getResp() ? "Sim" : "Não") + ")");
        
        System.out.println("\n=== TESTANDO EXCLUSÃO ===");
        aptoRecuperado.delMorador(m2);
        System.out.println("Morador " + m2.getNome() + " removido.");
        
        System.out.println("Morador restante: " + aptoRecuperado.getMorador(0).getNome());
    }
}