import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double valorDeposito;
        double valorSaque;

        while (true) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
