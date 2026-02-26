package LP1.Condominio;

public class Main {
    public static void main(String[] args) {

        Condominio oCondominio = new Condominio();

        oCondominio.setEndereco("Rua Procopio");
        oCondominio.setNumero(407);
        oCondominio.setConstrutora("Construtora Albuquerque");

        oCondominio.setBloco(new Bloco(1, "Bloco A", new Apartamento(2, 407, false, new Morador("João", 30, true))));

        System.out.println("====Dados do Condominio====");
        System.out.println("Endereco do condominio:" + oCondominio.getEndereco());
        System.out.println("Número:" + oCondominio.getNumero());
        System.out.println("Construtora:" + oCondominio.getConstrutora());
        System.out.println();

        System.out.println("====Dados do Bloco====");
        System.out.println("Número do bloco:" + oCondominio.getBloco().getNumero());
        System.out.println("Apelido do bloco:" + oCondominio.getBloco().getApelido());
        System.out.println();

        System.out.println("====Dados do Apartamento====");
        System.out.println("Numero de andares:" + oCondominio.getBloco().getApartamento().getAndar());
        System.out.println("Numero de numero:" + oCondominio.getBloco().getApartamento().getNumero());
        String cobertura = ( (oCondominio.getBloco().getApartamento().getCobertura() == true) ? "Sim" : "Não");
        System.out.println("Cobertura:" + cobertura);
        System.out.println();

        System.out.println("====Dados do Morador====");
        System.out.println("Nome do Morador:" + oCondominio.getBloco().getApartamento().getMorador().getNome());
        System.out.println("Idade do Morador:" + oCondominio.getBloco().getApartamento().getMorador().getIdade());
        String responsavel = ( (oCondominio.getBloco().getApartamento().getMorador().getResp() == true) ? "Sim" : "Não");
        System.out.println("Responsavel:" + responsavel);
        System.out.println();
    }
}