import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("[DIO] Conta bancária");

        System.out.println("Por favor, digite o número da conta: ");
        int conta = scan.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scan.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque");
    }
}
