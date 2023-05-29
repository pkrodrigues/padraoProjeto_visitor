package designpattern.behaviroral;

public class Recepcionista {
    private int codigo;
    private String nome;
    private int quantidadesIdiomasFalados;
    private String turnoTrabalho;

    public Recepcionista(int codigo, String nome, int quantidadesIdiomasFalados, String turnoTrabalho) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadesIdiomasFalados = quantidadesIdiomasFalados;
        this.turnoTrabalho = turnoTrabalho;
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

    public int getQuantidadesIdiomasFalados() {
        return quantidadesIdiomasFalados;
    }

    public void setQuantidadesIdiomasFalados(int quantidadesIdiomasFalados) {
        this.quantidadesIdiomasFalados = quantidadesIdiomasFalados;
    }

    public String getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(String turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

    public String aceitar(Visitor visitor)
    {
        return visitor.exibirRecepcionista(this);
    }
}
