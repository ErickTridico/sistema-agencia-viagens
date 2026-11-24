package main;

import java.time.LocalDate;

public class Reserva {

    private int codigo;
    private LocalDate data;
    private String status;

    private Cliente cliente;
    private PacoteViagem pacote;

    public Reserva(int codigo, LocalDate data, Cliente cliente, PacoteViagem pacote) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.pacote = pacote;
        this.status = "Pendente";
    }

    public void confirmar() {
        if (!status.equals("Cancelada")) {
            status = "Confirmada";
        }
    }

    public void cancelar() {
        if (!status.equals("Cancelada")) {
            status = "Cancelada";
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }
}
