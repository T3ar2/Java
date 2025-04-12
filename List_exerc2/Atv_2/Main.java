//02) Crie um sistema que represente diferentes tipos de drones. Todos os drones devem ter número
//        de série, altitude atual e um metodo voar(). Crie pelo menos dois tipos de drones:
//DroneFotografico (com resolução da câmera) e DroneEntrega (com peso máximo de
//carga). Implemente um metodo relatorioStatus() em cada um.

public class Main {
    public static void main(String[] args) {
        DroneFotografico droneFotografico = new DroneFotografico("SN-2025DR-XK9Z44", 120, 8.29);

        droneFotografico.relatorioStatus();

        DroneEntrega droneEntrega = new DroneEntrega("DRN4-2039F7XJ92", 150, 0.57);

        droneEntrega.relatorioStatus();
    }
}
