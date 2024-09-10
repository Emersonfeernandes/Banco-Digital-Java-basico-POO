import clientesdobanco.Cliente;
import java.util.Scanner;
import tipoContas.ContaCorrente;

public class BancoDigital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ContaCorrente contaCorrente = new ContaCorrente();
        Cliente cliente = new Cliente();

        cliente.setCPF("952.303.673-50");


        System.out.println("Digite o CPF:");
        String CPF = scanner.next();
        
        System.out.println("\n===================================\n");

        if(cliente.autenticacao(CPF)){
            System.out.println("Autenticação invalida.");
            continuar = false;
            
        } else{
            contaCorrente.setNumeroConta(cliente.getNumeroConta());
            contaCorrente.setAgencia(cliente.getAgencia());
            contaCorrente.setSaldo(cliente.getSaldo());
        }

        while (continuar) {
            System.out.println("1 - Deposito\n2 - Saque\n3 - Transferência\n4 - Extrato\n0 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                
                case 1:
                    System.out.println("\n===================================\n");

                    System.out.println("Digite valor do deposito:");
                    double valorDeposito = scanner.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                    
                    System.out.println("\n===================================\n");
                    break;

                case 2:
                    System.out.println("\n===================================\n");

                    System.out.println("Digite valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    contaCorrente.sacar(valorSaque);
                    
                    System.out.println("\n===================================\n");
                    break;

                case 3:
                    System.out.println("\n===================================\n");

                    System.out.println("Digite valor da transferência:");
                    double valorTransferecia = scanner.nextDouble();
                    System.out.println("Digite conta destino para transferir:");
                    int destino = scanner.nextInt();
                    contaCorrente.transferir(valorTransferecia, destino);
                    
                    System.out.println("\n===================================\n");
                    break;

                case 4:
                    System.out.println("\n===================================\n");

                    System.out.println(
                        "Conta: " + contaCorrente.getNumeroConta() +
                        "\nAgência: " + contaCorrente.getAgencia() +
                        "\nSaldo: " + contaCorrente.getSaldo()
                        );

                    System.out.println("\n===================================\n");
                    break;

                case 0:
                    System.out.println("\n===================================\n");
                    
                    System.out.println("Programa encerrado.");
                    continuar = false; 
                    break;
                default:
                    System.out.println("\n===================================\n");

                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}