import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int numConta;
        String agencia, nomeCliente = "MARIO ANDRADE";
        Double saldo = 237.48;


        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();
        System.out.println("\nPor favor, digite o número da Conta !");
        numConta = scanner.nextInt();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo de " + saldo + " já está disponível para saque.\n");

        scanner.close();
    }
}