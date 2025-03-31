public class JogadorFutsal  extends Pessoa {
    private String posicao;

   public String getPosicao(){
        return posicao;
   }

   public void setPosicao(String posicao){
       this.posicao = posicao;
   }

   public void Treino(){
       System.out.println("O Jogador " + getName() + " (" + getPosicao()+ ") " + " está Treinando" );
   }

   public void Jogar(){
       System.out.println("O Jogador " + getName() + " (" + getPosicao()+ ") " + " está Jogando" );
   }
}
