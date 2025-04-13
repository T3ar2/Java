public class Containers_de_carga extends Containers{
    private int warning_risk;

    Containers_de_carga(int code, int eight, String destiny, int warning_risk){
        super(code, eight, destiny);
        this.warning_risk = warning_risk;
    };

    @Override
    public void verificarCondições(){
        super.verificarCondições();
        System.out.println("\nRisco de perigo (1-5): " + warning_risk );
    }

}
