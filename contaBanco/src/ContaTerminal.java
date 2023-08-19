import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("conta: ");
        int conta = scanner.nextInt();

        System.out.print("Número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Nome clinte: ");
        String nomeCliente = scanner.next();

        System.out.print("Saldo cliente: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println(("Olá "+ nomeCliente +"," +
                " obrigado por criar uma conta em nosso banco," +
                " sua agência é " + numeroAgencia + "," +
                " conta " + conta + " e seu saldo " + saldoCliente + " já está disponível para saque."));

    }
}