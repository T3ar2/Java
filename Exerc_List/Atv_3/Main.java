
03) Uma biblioteca deseja cadastrar seus livros. Cada livro deve ter um título, autor e número de
//páginas. O número de páginas não pode ser alterado após a criação do livro.
// Requisito: Crie a classe Livro garantindo que o número de páginas seja imutável após a criação
public class Main {

    public static void main (String[] args){
        Library library = new Library("Maus: A Survivor's Tale", "Art Spiegelman", 160);
        
        library.Details();
    }
}
