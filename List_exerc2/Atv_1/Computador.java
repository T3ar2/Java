public class Computador  extends Dispositivos{
    private String sistema_operacional;

    Computador(int ip, String name, String sistema_operacional){
        super(ip, name);
        this.sistema_operacional = sistema_operacional;
    }


    @Override
    public void ExibirInformacoes(){
        super.ExibirInformacoes();
        System.out.println("Sistema Operacional: " + sistema_operacional);
    }
}
