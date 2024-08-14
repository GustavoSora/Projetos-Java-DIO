import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double saldo = 237.48;
        int numeroConta = 1021;

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.nextLine();

       System.out.println("Olá, " + nome + " Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta numero " + numeroConta + 
       ", e seu saldo é " + saldo + ", já está disponivel para saque.");



    }
}
