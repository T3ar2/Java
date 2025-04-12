public class Impressora extends Dispositivos{
    private int cor;

    public Impressora(int ip, String name, int cor){
        super(ip, name);
        this.cor = cor;
    }

    @Override
    public void ExibirInformacoes(){
        super.ExibirInformacoes();
        if (cor == 1){
            System.out.println("A impressora é colorida.");
        }
        else{System.out.println("A impressora não é colorida.");}
    }

}
