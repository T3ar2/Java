public class Dispositivos {
    private int ip;
    private String name;


    public Dispositivos(int ip, String name) {
        this.ip = ip;
        this.name = name;
    }



    public void ExibirInformacoes(){
        System.out.println("IP: "+ ip);
        System.out.println("Nome: " + name);
    }
}
