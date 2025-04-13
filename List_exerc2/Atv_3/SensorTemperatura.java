public class SensorTemperatura extends Estufa{
    private double temperatura;
     SensorTemperatura(String id, double temperatura){
         super(id);
        this.temperatura = temperatura;
     }

     @Override
     public void lerValor(){
         super.lerValor();
         System.out.println("A temperatura é de " + temperatura +  "°C.");
     }
}
