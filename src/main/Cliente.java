package main;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private String telefone;
    private String cpf;

    private ArrayList<Reserva> reservas;

    public Cliente(String nome, String email, String telefone, String cpf) {
        super(nome, email);
        this.telefone = telefone;
        this.cpf = cpf;
        this.reservas = new ArrayList<Reserva>();
    }

    @Override
    public String tipoUsuario() {
        return "Cliente";
    }

    public void realizarReserva(Reserva reserva) {
        if (reserva != null) {
            reservas.add(reserva);
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
