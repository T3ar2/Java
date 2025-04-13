public class Containers_refrigerados extends Containers{
    private int max_temp;
    private int min_temp;

    Containers_refrigerados(int code, int eight, String destiny, int max_temp, int min_temp ){
        super(code, eight, destiny);
        this.max_temp = max_temp;
        this.min_temp = min_temp;
    }

    @Override
    public void verificarCondições(){
        super.verificarCondições();
        System.out.println("\nTemperatura mínima: " + min_temp +"°c "+ "\nTemperatura Máxima: "+ max_temp + "°c.");
    }
}
