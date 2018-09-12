import java.util.Scanner;
public class teste1 {
    public static void main(String[] args) {
    Scanner conta = new Scanner(System.in);
    System.out.println("Escolha Qual operação deseja Fazer !!");
    System.out.println("---------------------------");
    System.out.println("Digite seu Saldo Inicial: ");
    int saldo = conta.nextInt();
    int opcao = 0;
    while (opcao != 4) {
    System.out.println("Digite 1 para Saque");
    System.out.println("Digite 2 para Deposito ");
    System.out.println("Digite 3 para ver o Saldo");
    System.out.println("Digite 4 para Sair");
    System.out.println("---------------------------");
    opcao = conta.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Qual o valor do saque? ");
            int saque = conta.nextInt();
            if (saque <= saldo) {
            saldo = (saldo - saque);
            System.out.println("Você fez um saque de " + saque + " e seu saldo é de " + saldo);
            } else {
            System.out.println("Seu saldo é insuficiente");
            }
            break;
        case 2:
            System.out.println("Qual o valor do Deposito? ");
            int deposito = conta.nextInt();
            saldo = deposito + saldo;
            System.out.println("Você efetuou um deposito de " + deposito + " e seu saldo é de " + saldo);
            break;
        case 3:
            System.out.println("seu saldo atual é de " + saldo);
            break;
    }
    }
    System.out.println("Sistema Finalizado!!");
    }
}
