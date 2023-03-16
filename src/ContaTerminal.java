import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldoConta;

        System.out.println("Digite seu nome");
        nomeCliente = sc.next();

        System.out.println("Digite o número da Agencia");
        agencia = sc.next();

        System.out.println("Digite o númerro da conta");
        numeroConta = sc.nextInt();

        System.out.println("Digite a quantidade que deseja depositar.");
        saldoConta = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numeroConta + "e seu saldo " + saldoConta + " já está disponível para saque.");
    }
}
