public class CarroEmAcao {
    public static void main (String [] args) {
        Carro meuCarro = new Carro();

        meuCarro.setModelo ("Fusca");
        meuCarro.setCor ("Azul");
        meuCarro.setAno (1985);

        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Ano: " + meuCarro.getAno());

        meuCarro.mostrarInfo();


    }

}
