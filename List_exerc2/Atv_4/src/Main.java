//04) Modelar um sistema para rastrear containers em navios. Todos os containers têm um código
//único, peso e destino. Containers refrigerados devem ter temperatura mínima e máxima, enquanto
//containers de carga perigosa precisam de um nível de risco (1 a 5). Implemente metodo
//verificarCondições() específico para cada tipo.

public class Main {
    public static void main(String[] args) {

        Containers_de_carga containers_de_carga = new Containers_de_carga(789,8,"Shanghai,China", 1);
        containers_de_carga.verificarCondições();

        Containers_refrigerados containersRefrigerados = new Containers_refrigerados(123, 10, "Rotterdam, Netherlands", 18, 28);
        containersRefrigerados.verificarCondições();

    }
}