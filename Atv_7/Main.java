import java.util.Scanner;


public class Main{

    public static void main (String[] args) throws Exception {

        JogadorFutebol jogadorFutebol = new JogadorFutebol();

        jogadorFutebol.setName("Cleitin");
        jogadorFutebol.setAge(106);
        jogadorFutebol.setPosicao("Banco");

        JogadorFutsal jogadorFutsal = new JogadorFutsal();

        jogadorFutsal.setName("Cleitão");
        jogadorFutsal.setAge(500);
        jogadorFutsal.setPosicao("Volante");

        jogadorFutebol.Jogar();
        jogadorFutebol.Treino();

        jogadorFutsal.Jogar();
        jogadorFutsal.Treino();


    }
}
