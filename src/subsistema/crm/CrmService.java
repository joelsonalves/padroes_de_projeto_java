package subsistema.crm;

public class CrmService {

    private CrmService() {

        super();

    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {

        System.out.println("Cliente salvo no CRM com os seguintes dados cadastrais:");
        System.out.println(String.format("Nome: %s", nome));
        System.out.println(String.format("CEP: %s", cep));
        System.out.println(String.format("Cidade: %s", cidade));
        System.out.println(String.format("Estado: %s", estado));

    }

}
