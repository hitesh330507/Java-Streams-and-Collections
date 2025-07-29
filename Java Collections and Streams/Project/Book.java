package Project;
public class Book {
    private int Bookid;
    private String Bookname;
    private String Author;
    private String Publisher;
    private int Price;
    private String Booktype;

    public int getBookid() {
        return Bookid;
    }
    public void setBookid(int bookid) {
        Bookid = bookid;
    }
    public String getBookname() {
        return Bookname;
    }
    public void setBookname(String bookname) {
        Bookname = bookname;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public String getPublisher() {
        return Publisher;
    }
    public void setPublisher(String publisher) {
        Publisher = publisher;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public String getBooktype() {
        return Booktype;
    }
    public void setBooktype(String booktype) {
        Booktype = booktype;
    }
    @Override
    public String toString() {
        return "Book [Bookid=" + Bookid + ", Bookname=" + Bookname + ", Author=" + Author + ", Publisher=" + Publisher
                + ", Price=" + Price + ", Booktype=" + Booktype + "]";
    }
}
