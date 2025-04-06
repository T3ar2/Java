import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha qual conta quer acessar (Apenas coloque os números):  ");
        System.out.println("1 - Conta Corrente.");
        System.out.println("2 - Conta Poupança.");
        int esc = scanner.nextInt();

        if (esc == 1) {
            esc = 0;

            Conta_Corrente contacorrente = new Conta_Corrente(1000);
            contacorrente.Detalhe();
            contacorrente.Taxes();
            System.out.println("Escolha qual método você quer utilizar:  ");
            System.out.println("1 - saque.");
            System.out.println("2 - Depósito.");
            esc = scanner.nextInt();
            if (esc == 1){
                esc = 0;
                contacorrente.Saque();
                System.out.println("Emitir o extrato?:  ");
                System.out.println("1 - Sim.");
                System.out.println("2 - Não.");
                esc = scanner.nextInt();
                if (esc == 1) {
                    contacorrente.Estrato();
                }
            } else if (esc == 2) {
                esc = 0;
                contacorrente.Deposito();
                System.out.println("Emitir o extrato?:  ");
                System.out.println("1 - Sim.");
                System.out.println("2 - Não.");
                esc = scanner.nextInt();
                if (esc == 1) {
                    contacorrente.Estrato();
                }
            }

        } else if (esc == 2) {
            Conta_Poupanca contapoupanca = new Conta_Poupanca(1000);
            esc =  0;
            contapoupanca.Detalhe();
            contapoupanca.Juros();
            contapoupanca.Detalhe();
            System.out.println("Escolha qual método você quer utilizar:  ");
            System.out.println("1 - saque.");
            System.out.println("2 - Depósito.");
            esc = scanner.nextInt();
            if (esc == 1){
                esc = 0;
                contapoupanca.Saque();
                System.out.println("Emitir o extrato?:  ");
                System.out.println("1 - Sim.");
                System.out.println("2 - Não.");
                esc = scanner.nextInt();
                if (esc == 1) {
                    contapoupanca.Estrato();
                }
            } else if (esc == 2) {
                esc = 0;
                contapoupanca.Deposito();
                System.out.println("Emitir o extrato?:  ");
                System.out.println("1 - Sim.");
                System.out.println("2 - Não.");
                esc = scanner.nextInt();
                if (esc == 1) {
                    contapoupanca.Estrato();
                }
            }
        }


    }
}
