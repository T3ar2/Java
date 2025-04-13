public class SensorLuminosidade extends  Estufa{
    private int luminosidade;

    SensorLuminosidade(String id, int luminosidade){
        super(id);
        this.luminosidade = luminosidade;
    }

    @Override
    public void lerValor(){
        super.lerValor();
        System.out.println("A luminosidade é de " + luminosidade+  "%.");
    }
}
