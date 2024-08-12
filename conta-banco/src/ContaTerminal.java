import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Seja bem-vindo(a) ao nosso banco. Para criar uma conta preencha as informações a seguir: ");

        String nomeCliente = "";
        String agencia = "";
        int numero = 0;
        double saldo = 0.0;
        
        // Ler o nome do Cliente
        System.out.println("Por favor, para iniciar, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        // Ler o número da Agência
        System.out.println("Em seguida digite o número da Agência: ");
        agencia = scanner.nextLine();

        // Ler o número da conta
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Agora digite o número da sua conta: ");
                numero = scanner.nextInt();
                entradaValida = true;        
            } catch (InputMismatchException e) {
                System.out.println("Número da conta inválido. Por favor, insira um número válido.");
                scanner.next();
            }
        }

        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Para encerrarmos digite o seu saldo atual: ");
                saldo = scanner.nextDouble();
                entradaValida = true;  
            } catch (InputMismatchException e) {
                System.out.println("Saldo inválido. Por favor, insira um número válido.");
                scanner.next();
            }
        }

        scanner.nextLine();

        System.out.println("-------------------------------------------");

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
