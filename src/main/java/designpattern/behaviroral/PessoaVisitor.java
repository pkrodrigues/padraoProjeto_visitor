package designpattern.behaviroral;

public class PessoaVisitor implements Visitor{
    public String exibir(Pessoa pessoa)
    {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirHospede(Hospede hospede)
    {
        return "Hospede{" + "Id: " +hospede.getId() + ", nome: '"+hospede.getNome() + '\''+", quarto: "+hospede.getNumeroQuarto()+'}';
    }

    @Override
    public String exibirDiarista(Diarista diarista)
    {
        return "Diarista{" + "Id: " +diarista.getCodigo() + ", nome: '"+diarista.getNome() + '\''+", Valor da diaria: R$ "+diarista.getDiaria()+'}';
    }

    public String exibirRecepcionista(Recepcionista recepcionista)
    {
        return "Recepcionista{" + "Id: " +recepcionista.getCodigo() + ", nome: '"+recepcionista.getNome() + '\''+", turno: "+recepcionista.getTurnoTrabalho()+" , quantidade de idiomas falados:"+recepcionista.getQuantidadesIdiomasFalados()+'}';
    }

}
