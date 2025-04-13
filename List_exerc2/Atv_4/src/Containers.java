public class Containers {
    private int code;
    private int eight;
    private String destiny;

    Containers(int code, int eight, String destiny){
        this.code = code;
        this.eight = eight;
        this.destiny = destiny;
    }

    public void verificarCondições(){
        System.out.println("Código: " + code + "\nPeso: " + eight+ "tons." + "\nDestino: " + destiny);
    }
}
