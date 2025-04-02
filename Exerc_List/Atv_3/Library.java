public class Library {
    private String title;
    private String author;
    private int num_pages;

    Library(String title, String author, int num_pages){
        this.title = title;
        this.author = author;
        this.num_pages = num_pages;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getNum_pages(){
        return num_pages;
    }

    public void Details(){
        System.out.println("Details: ");
        System.out.println("Book: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Number of pages: " + getNum_pages() + " pages.");

    }

}
