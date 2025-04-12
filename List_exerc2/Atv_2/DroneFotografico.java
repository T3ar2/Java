public class DroneFotografico extends Drones{
    private double res_cam;

    DroneFotografico(String num_series, int alt_atual, double res_cam){
        super(num_series, alt_atual);
        this.res_cam = res_cam;
    }


    public void relatorioStatus() {
        Voar();
        System.out.println("E está filmando em uma resolução de " + res_cam + " mp");
    }
}
