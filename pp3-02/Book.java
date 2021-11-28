public class Book
{
    String title;
    String authorName;
    String authorSurname;
    int pages;
    int currentPage;
    boolean open;
    
    void openOrClose(){
        open = !open;
    }
    
    void flipPage(){
        if(open){
            currentPage += 1;
        }
    }
    
    void flipPage(int page){
        if(open){
            currentPage = page;
        }
    }
    
    void displayPage(){
        System.out.println(currentPage);
    }
    
    void displayAuthor(){
        System.out.println("Name: " + authorName + ", Surname: " + authorSurname);
    }
}
