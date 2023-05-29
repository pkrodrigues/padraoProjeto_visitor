package designpattern.behaviroral;

public class Quarto {
    private int numeroQuarto;
    private String descricao;

    public Quarto(int numeroQuarto, String descricao) {
        this.numeroQuarto = numeroQuarto;
        this.descricao = descricao;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
