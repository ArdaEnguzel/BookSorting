import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main  {
    public static void main(String args[]){
        Book book1=new Book("Crime and Punishment","Dostoyevski",1866,672);
        Book book2=new Book("The Brothers Karamazov","Dostoyevski",1880,975);
        Book book3=new Book("Dwemons","Dostoyevski",1868,345);
        Book book4=new Book("The Gambler","Dostoyevski",1869,314);
        Book book5=new Book("White Nights","Dostoyevski",1870,124);
        TreeSet<Book> nameSort= new TreeSet<>();
        nameSort.add(book1);
        nameSort.add(book2);
        nameSort.add(book3);
        nameSort.add(book4);
        nameSort.add(book5);
        for(Book b:nameSort){
            System.out.println(b);
        }
        TreeSet<Book> pageSort= new TreeSet<>(new Comparator<Book>(){
            public int compare(Book b1, Book b2){
                return b1.getPageNumber()-b2.getPageNumber();
            }
        });
        pageSort.add(book1);
        pageSort.add(book2);
        pageSort.add(book3);
        pageSort.add(book4);
        pageSort.add(book5);
        System.out.println("---------------");
        System.out.println("Sorting by pageNumber");
        for(Book b:pageSort){
            System.out.println(b);
        }






    }
}
