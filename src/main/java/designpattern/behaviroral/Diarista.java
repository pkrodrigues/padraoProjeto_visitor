package designpattern.behaviroral;

public class Diarista implements Pessoa{
    private int codigo;
    private String nome;
    private double diaria;

    public Diarista(int codigo, String nome, double diaria) {
        this.codigo = codigo;
        this.nome = nome;
        this.diaria = diaria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String aceitar(Visitor visitor)
    {
        return visitor.exibirDiarista(this);
    }
}
