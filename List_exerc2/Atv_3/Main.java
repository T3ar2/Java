//03) Modelar uma estufa automatizada que controla diferentes sensores: de umidade, temperatura e
//luminosidade. Todos os sensores devem ter um ID e um metodo lerValor(). Cada tipo de
//sensor deve retornar uma leitura simulada com base em seu tipo.
public class Main {
    public static void main(String[] args) {

        SensorTemperatura sensorTemperatura = new SensorTemperatura("UMD-12345", 10);
        sensorTemperatura.lerValor();

        SensorLuminosidade  sensorLuminosidade = new SensorLuminosidade("UMD-12345", 60);
        sensorLuminosidade.lerValor();

        SensorUmidade sensorUmidade = new SensorUmidade("UMD-12345", 20);
        sensorUmidade.lerValor();
    }
}
