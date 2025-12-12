import java.util.Scanner;

public class Banco {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double saldo = 1000, valor = 0;
        int op = 0;

        String opcoes =
                """
                Opções:
                1 - Saldo
                2 - Deposito
                3 - Saque
                4 - Sair
                """;
        do{
            System.out.println(opcoes);
            System.out.println("Escolha uma opção: ");
            op = teclado.nextInt();

            if(op == 1){// Mostrar saldo
                System.out.println("Seu saldo atual: " + saldo);
            }else if(op == 2){// Fazer deposito...
                System.out.println("Quando deseja depositar: ");
                valor = teclado.nextDouble();
                saldo += valor;
            }else if(op == 3){// Fazer saque...
                System.out.println("Quanto deseja sacar: ");
                valor = teclado.nextDouble();
                if(valor > saldo){
                    System.out.println("Saldo insuficiente...\nTente novamente...\nSeu saldo atual: "+saldo);
                }else {
                    saldo -= valor;
                }
            }else if(op == 4){
                System.out.println("Saindo da conta.");
            }else{
                System.out.println("Opção Inválida!\nDigite uma opção válida... ");
            }

        }while(op != 4);

        teclado.close();

    }
}
