public class SensorUmidade extends Estufa{
    private double umidade;

    SensorUmidade(String id, double umidade){
        super (id);
        this.umidade = umidade;
    }

    @Override
    public void lerValor(){
        super.lerValor();
        System.out.println("A umidade foi de " + umidade + "%.");
    }
}
