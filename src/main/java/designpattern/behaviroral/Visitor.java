package designpattern.behaviroral;

public interface Visitor {
    String exibirHospede(Hospede hospede);
    String exibirRecepicionista(Recepicionista recepicionista);

    String exibirDiarista(Diarista diarista);
}
