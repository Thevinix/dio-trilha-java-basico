// ToDo: Conhecer e importar a classe scanner
        //  Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada


import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite o Numero da Agencia com digito");
            String agencia = scanner.next();

            System.out.println("Digite o numero da sua Conta corrente");
            int contaCorrente = scanner.nextInt();

            System.out.println("Para abertura da conta será necessario depositar uma quantia inical");
            System.out.println("Quanto você gostaria de depositar inicialmente? ");
            double saldo = scanner.nextDouble();

            
   //Imprimr  os dados coletados
   System.out.println ("Olá " + nome + " " + sobrenome + " " +
    "obrigado por criar uma conta em nosso banco" + " sua agência é: " + agencia + " conta: " + contaCorrente + " Seu saldo é: "+ saldo );
        }



    }
}
