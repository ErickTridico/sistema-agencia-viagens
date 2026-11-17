package main;

public class Executor {

    public static void main(String[] args) {

        // Funcionario
        Funcionario funcionario = new Funcionario(
            "Erick", "erick@email.com", "Gerente", 101
        );

        // Cliente
        Cliente cliente = new Cliente(
            "Gabriel", "gabriel@email.com", "11999999999", "12345678900"
        );

        // Pacote de viagem
        PacoteViagem pacote = new PacoteViagem(
            "Rio de Janeiro", 5, 1500.00, funcionario
        );

        funcionario.cadastrarPacote(pacote);

        // Reserva
        Reserva reserva = new Reserva(
            1, "25/12/2026", cliente, pacote
        );

        cliente.realizarReserva(reserva);

        // Confirmando a reserva
        reserva.confirmar();

        // Exibir os dados
        System.out.println("=== AGENCIA DE VIAGENS ===");

        System.out.println("\nCliente: " + cliente.getNome());
        System.out.println("Tipo: " + cliente.tipoUsuario());

        System.out.println("\nFuncionario: " + funcionario.getNome());
        System.out.println("Tipo: " + funcionario.tipoUsuario());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Matricula: " + funcionario.getMatricula());

        System.out.println("\n=== PACOTE DE VIAGEM ===");
        pacote.exibirDetalhes();

        System.out.println("\n=== RESERVA ===");
        System.out.println("Codigo: " + reserva.getCodigo());
        System.out.println("Data: " + reserva.getData());
        System.out.println("Status: " + reserva.getStatus());
    }
}
