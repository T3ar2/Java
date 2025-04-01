
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner (System.in);

        biblioteca.Biblioteca[0] = new Livro("Bomdia Flamengo" , "Cleitin", 50.00);
        biblioteca.Biblioteca[1] = new Livro("Bomdia Corintia" , "Cleiton", 20.00);
        biblioteca.Biblioteca[2] = new Livro("Bomdia AAAAAAAA" , "Cleitão", 10.00);


        System.out.println("Você quer ver um livro ou a biblioteca inteira?(B para biblioteca e L para livro) ");
        char escolha = scanner.next().charAt(0);
        if ((escolha == 'L') ||  (escolha == 'l')) {
            biblioteca.ApresentaLivro();
        }
        else if ((escolha == 'B') ||  (escolha == 'b')){
            biblioteca.ApresentarBiblioteca();
        }




    }
}
