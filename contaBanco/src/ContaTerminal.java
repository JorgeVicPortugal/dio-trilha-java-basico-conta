import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main (String[] args) throws Exception {

        ContaTerminal conta = new ContaTerminal();
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o número da conta:");
            conta.numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite a Agência:");
            conta.agencia = scanner.nextLine();

            System.out.println("Digite o nome do cliente:");
            conta.nomeCliente = scanner.nextLine();

            System.out.println("Digite o saldo:");
            conta.saldo = scanner.nextDouble();
         

        System.out.println(
            "Olá " + conta.nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia +
            ", conta " + conta.numero + 
            " e seu saldo " + conta.saldo + " já está disponível para saque"      );

    }
}
