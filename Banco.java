import java.util.Scanner;

public class Banco {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, testaConta, conta;
        double saldo = 0, valor = 0;
        int op = 0;

        System.out.println("Criando sua conta:");

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite sua conta: ");
        testaConta = teclado.nextLine();

        // Tratamento para o usuário digitar o tipo de conta.
        if(testaConta.equals("corrente") || testaConta.equals("poupança")){
            conta = testaConta;
        }else{
            while(!testaConta.equals("corrente") && !testaConta.equals("poupança")){
                System.out.println("Digite um tipo de conta válida: ");
                testaConta = teclado.nextLine();
            }
            conta = testaConta;
            //System.out.println("O que tem: "+conta);
        }

        System.out.print("Valor do saldo inicial: ");
        saldo = teclado.nextDouble();

        System.out.println("******************************************************");
        System.out.println("Conta Criada com sucesso! ");
        System.out.println("Nome: "+nome);
        System.out.println("Tipo de conta: "+conta);
        System.out.println("Saldo Inicial: "+saldo);

        System.out.println("******************************************************");

        String opcoes =
                """
                Opções:
                1 - Saldo
                2 - Deposito
                3 - Saque
                4 - Sair
                """;
        do{
            System.out.print(opcoes);
            System.out.print("Escolha uma opção: ");
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
            System.out.println();
        }while(op != 4);

        teclado.close();
    }
}
