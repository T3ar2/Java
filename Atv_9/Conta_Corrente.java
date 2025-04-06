public class Conta_Corrente extends Conta_bancaria{

    Conta_Corrente(double saldo){
        super(saldo);
    }

    public void Taxes(){
        saldo -= 10;
        System.out.println("Taxa de conta corrente cobrada. Novo saldo: " + saldo);
    }
}
