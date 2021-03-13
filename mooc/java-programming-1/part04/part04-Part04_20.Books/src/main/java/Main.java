import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String title;
        int pages, pubYear;
        
        while(true){
            System.out.print("Title: ");
            title = scanner.nextLine();
            if(title.equals("")) break;
            
            System.out.print("Pages: ");
            pages = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Publication year: ");
            pubYear = Integer.parseInt(scanner.nextLine());
            
            Book book = new Book(title, pages, pubYear);
            bookList.add(book);
        }
        
        System.out.print("What information will be printed? ");
        String printInfo = scanner.nextLine();
        
        for(Book b : bookList){
            if(printInfo.equals("everything")){
                System.out.println(b);
            }
            else if(printInfo.equals("name")){
                System.out.println(b.getTitle());
            }
        }
    }
}
