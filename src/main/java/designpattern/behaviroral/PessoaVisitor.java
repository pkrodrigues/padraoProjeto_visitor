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

}
