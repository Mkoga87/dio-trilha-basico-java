import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o número da sua conta ");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome ");
        String cliente = scanner.next();

        System.out.println("Digite o seu saldo ");
        double saldo = scanner.nextDouble();
        
        
        System.out.println("Olá " + nome + " " + cliente + " , obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " ,sua conta " + numero + " e seu saldo de " + saldo + " já está disponivel para saque.");
    }
}
