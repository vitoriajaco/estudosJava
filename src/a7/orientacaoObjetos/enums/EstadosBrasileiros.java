package a7.orientacaoObjetos.enums;


public enum EstadosBrasileiros {

    SAO_PAULO("SP", "São Paulo"),
    PERNAMBUCO("PE", "Pernambuco"),
    BAHIA("BA", "Bahia"),
    CEARA("CE", "Ceará"),
    ALAGOAS("AL", "Alagoas");

    String sigla;
    String estado;

    EstadosBrasileiros(String sigla, String estado) {
        this.sigla = sigla;
        this.estado = estado;
    }

}
