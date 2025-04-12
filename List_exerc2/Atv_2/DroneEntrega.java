public class DroneEntrega extends Drones{
    private double pes_max;

    DroneEntrega(String num_series, int alt_atual, double pes_max){
        super(num_series, alt_atual);
        this.pes_max = pes_max;
    }


    public void relatorioStatus(){
        Voar();
        System.out.println("E o peso máximo dele é de " + pes_max +"Kg.");
    }
}
