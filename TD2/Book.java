public class Book {
    private String title;
    private String author;
    private double price;
    private int year;
    //_________________constructors____________________________________
    public Book()
    {
        this.title = "uknown title";
        this.author = "unknown author";
        this.price = 0.0f;
        this.year = 0;
    }
    public Book(String title)
    {
        this();
        this.title=title;
    }
    public Book(String title ,String author)
    {
        this(title);
        this.author = author;
    }
    public Book(String title ,String author,double price)
    {
        this(title,author);
        this.price = price;
    }
    public Book(String title ,String author,double price, int year)
    {
        this(title,author,price);
        this.year= year;
    }
    public Book(Book book)
    {
        this(book.title,book.author,book.price,book.year);
    }
    //________________Getters__________________________________________
    public String getTitle ()
    {
        return title;
    }
    public String getAuthor ()
    {
        return author;
    }
    public Double getPrice ()
    {
        return price;
    }
    public int getYear ()
    {
        return year;
    }
    //________________Setters__________________________________________
    public void setTitle (String title)
    {
        this.title=title;
    }
    public void setAuthor (String author)
    {
        this.author=author;
    }
    public void setPrice (Double price)
    {
        this.price=price;
    }
    public void setYear (int year)
    {
        this.year=year;
    }
//___________toString___________________________
public String toString()
{
    return "Title : "+title+ " , Author : "+author+" , Price : "+price+" , Year : "+year ;
}
//__________main method for testing, we can put it in another class main ,
//but for now I'll leave it here in case I needed te class main for other
// exercises to avoid repeated classes .. that's so disturbing for now..
    static public void main(String [] args )
    {
        //Book testBook= new Book("The hobbit");
        //Book testBook= new Book("Amarita"," Amr Abdelhamid");
        Book testBook= new Book("Dear Long Leg","Jean Websteir",20,1980);
        testBook.setPrice(30.0);
        Book testBook2=new Book(testBook);
        testBook2.setTitle("Adeline");
        System.out.println(testBook2.toString());
    }
}
