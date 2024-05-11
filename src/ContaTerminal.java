import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        // cria o objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Agora insira o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Insira o código da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Insira seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é: "
                + agencia + ", "
                + "conta: " + conta
                + " e seu saldo: " + saldo
                + " já está disponível para saque.");
    }
}