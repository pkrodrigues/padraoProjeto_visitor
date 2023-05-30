package designpattern.behaviroral;

public class Hospede implements Pessoa {
    private int id;
    private String nome;
    private Quarto numeroQuarto;

    public Hospede(int id, String nome, Quarto numeroQuarto)
    {
        this.id = id;
        this.nome =  nome;
        this.numeroQuarto = numeroQuarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroQuarto() {
        return this.numeroQuarto.getNumeroQuarto();
    }

    public void setNumeroQuarto(Quarto numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String aceitar(Visitor visitor)
    {
        return visitor.exibirHospede(this);
    }
}
