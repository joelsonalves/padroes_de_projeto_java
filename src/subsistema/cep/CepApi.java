package subsistema.cep;

public class CepApi {

    private static class CepApiInstance {

        public static CepApi instance = new CepApi();

    }

    private CepApi() {

        super();

    }

    public static CepApi getInstance() {

        return CepApiInstance.instance;

    }

    public String recuperarCidade(String cep) {

        return "Recife";

    }

    public String recuperarEstado(String cep) {

        return "PE";

    }

}
