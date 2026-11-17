package main;

import java.util.ArrayList;

public class Funcionario extends Usuario {

    private String cargo;
    private int matricula;

    private ArrayList<PacoteViagem> pacotes;

    public Funcionario(String nome, String email, String cargo, int matricula) {
        super(nome, email);
        this.cargo = cargo;
        this.matricula = matricula;
        this.pacotes = new ArrayList<PacoteViagem>();
    }

    @Override
    public String tipoUsuario() {
        return "Funcionario";
    }

    public void cadastrarPacote(PacoteViagem pacote) {
        if (pacote != null) {
            pacotes.add(pacote);
        }
    }

    public String getCargo() {
        return cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public ArrayList<PacoteViagem> getPacotes() {
        return pacotes;
    }
}
