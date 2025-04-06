import java.util.Scanner;
public class Conta_bancaria {
    protected double saldo;
    protected double dep;
    protected double in_saldo;
    protected double saq;


    Scanner scanner = new Scanner(System.in);

    Conta_bancaria(double saldo){
        this.saldo = saldo;
    }


    public void Detalhe(){
        System.out.println("Saldo: " + saldo);
    }

    public void Deposito(){
        in_saldo = saldo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você quer depositar? ");
        dep = scanner.nextDouble();
        saldo += dep;
        System.out.println("Deposito de " + dep + " realizado com sucesso.");
    }
    public void Saque(){
        in_saldo = saldo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você quer sacar? ");
        saq = scanner.nextDouble();
        saldo -= saq;
        System.out.println("Saque de " + saq + " realizado com sucesso.");
    }

    public void Estrato(){
        System.out.println("|Extrato:");
        System.out.println("|Saldo primário: " + in_saldo);
        System.out.println("|Saque: -" + saq);
        System.out.println("|Deposito: +" + dep);
        System.out.println("|Total: " + saldo);
    }
}
