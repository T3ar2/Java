//01) Uma empresa deseja modelar os dispositivos conectados em uma rede corporativa. Cada
//dispositivo tem um nome e um endereço IP. Crie uma classe abstrata Dispositivo e duas classes
//derivadas: Computador e Impressora. A classe Computador deve ter um sistema
//operacional, e a Impressora deve informar se é colorida ou não. Implemente um metodo
//exibirInformacoes() em cada classe.
public class Main{
    public static void main(String[] args) {
    Computador computador = new Computador(01, "Lenovo IdeaPad", "Linux");

    computador.ExibirInformacoes();

    Impressora impressora = new Impressora(02,"Multilaser", 1);

    impressora.ExibirInformacoes();
    }
}
