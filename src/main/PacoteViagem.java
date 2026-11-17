package main;

public class PacoteViagem {

    private String destino;
    private int duracaoDias;
    private double preco;

    private Funcionario funcionario;

    public PacoteViagem(String destino, int duracaoDias, double preco,
                        Funcionario funcionario) {

        this.destino = destino;
        this.duracaoDias = duracaoDias;
        this.preco = preco;
        this.funcionario = funcionario;
    }

    public double calcularPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Destino: " + destino);
        System.out.println("Duracao: " + duracaoDias + " dias");
        System.out.println("Preco: R$ " + preco);
    }

    public String getDestino() {
        return destino;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    public double getPreco() {
        return preco;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
