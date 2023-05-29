package designpattern.behaviroral;

public interface Visitor {
    String exibirHospede(Hospede hospede);
    String exibirRecepcionista(Recepcionista recepcionista);

    String exibirDiarista(Diarista diarista);
}
