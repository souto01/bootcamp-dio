import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        //criando o objeto scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Por favor digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Por favor Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Por favor Digite sua agência ");
            int agencia = scanner.nextInt();

            System.out.println("Por favor Digite sua conta corente ");
            String contaCorrente = scanner.next();

            System.out.println("Por favor Digite sua saldo ");
            double saldo = scanner.nextDouble();
            
            System.out.println(" Olá " + nome + " " + sobrenome +
             ", obrigado por criar uma conta em nosso banco, sua agência é " + 
             agencia + " conta " + contaCorrente + " e seu saldo disponível para saque é R$ " + saldo);
            
        } catch (Exception e) {
           System.out.println("exeption" + e.getMessage());
        }
    }
}

    