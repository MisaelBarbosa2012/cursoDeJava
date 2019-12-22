import java.util.*;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    ContaBancaria conta = new ContaBancaria();
    char opt;
        System.out.println("Vai ter Deposito iniial? S/N: ");
        opt = sc.nextLine().charAt(0);
        double deposito=0;

    System.out.print("Digie o nome: ");
    conta.setNome(sc.nextLine());
        System.out.print("Numero da conta: ");
        conta.setNumeroConta(sc.nextLine());
        if(opt=='s'){
            System.out.print("Deposito incial: ");
            deposito = sc.nextDouble();
        }

        double saldo = 0;
        int escolha = 0;
        double saque = 0;
        double saldo_real = saldo + deposito;


        while(true){
            System.out.print("------escolha uma opção---------\n1)saldo" +
                    "\n2)deposito\n3)Saque\n4)Editar nome\n5)Editar numero da conta: ");
            escolha = sc.nextInt();
            System.out.println("--------------------------");
            while(escolha==1){
                System.out.printf("\nNome: %s\nNumero da conta: %s\nSaldo: R$%.2f\n\n",conta.getNome(),
                        conta.getNumeroConta(),saldo_real);
                System.out.print("pressione 0 para voltar ao menu anterior: ");
                escolha = sc.nextInt();

            }
            while(escolha==2){
                System.out.print(" Digite quantos quer depositar:");
                deposito = sc.nextDouble();
                saldo_real = saldo_real +deposito;
                System.out.printf("Você depositou:R$%.2f ",deposito);
                System.out.print("\n pressione 0 para voltar ao menu anterior ou 2 para novo deposito: ");
                escolha = sc.nextInt();
            }
            while(escolha==3){
                System.out.print("Digite quantos quer sacar: ");
                saque = sc.nextDouble();
                if(saldo_real<saque){
                    System.out.println("Você mão tem saldo para esse saque");
                }else{

                    System.out.printf("Voce sacou: R$%.2f\n",saque);
                    saldo_real = saldo_real - saque;
                }
                System.out.print("\npressione 0 para voltar ao menu anterior ou 3 para novo saque:  ");
                escolha = sc.nextInt();
            }
            while (escolha==4){
                System.out.println("Nome atual: "+conta.getNome());
                System.out.println("Digite o novo nome: ");
                sc.nextLine();
                conta.setNome(sc.nextLine());
                System.out.print("\npressione 0 para voltar ao menu anterior:");
                escolha = sc.nextInt();
            }
            while(escolha==5){
                System.out.print("Editar numero da conta: ");
                sc.nextLine();
                conta.setNumeroConta(sc.nextLine());
                System.out.print("\npressione 0 para voltar ao menu anterior:: ");
                escolha = sc.nextInt();
            }
            if(escolha>5||escolha<0){
                System.out.println("===========================");
                System.out.println("Opção inválida");
                System.out.println("=============================");
            }

        }









    }
}
