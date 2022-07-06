public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int releaseDate;
    private int pageNumber;
    public Book(String name,String author,int releaseDate,int pageNumber){
        this.name=name;
        this.author=author;
        this.releaseDate=releaseDate;
        this.pageNumber=pageNumber;

    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getReleaseDate(){
        return this.releaseDate;
    }
    public int getPageNumber(){
        return this.pageNumber;
    }
    @Override
    public int compareTo(Book other){
        return this.getName().compareTo(other.getName());

    }
    @Override
    public String toString(){
        return "Book: " +this.getName() + " pageNumber:"+ this.getPageNumber();
    }
}
