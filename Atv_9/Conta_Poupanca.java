import java.util.Scanner;

public class Conta_Poupanca extends Conta_bancaria{

    Conta_Poupanca(double saldo){
        super(saldo);
    }

    public void Juros(){
       saldo *= 1.05;
        System.out.println("Juros adicionados. Novo saldo: " + saldo);
    }



}

