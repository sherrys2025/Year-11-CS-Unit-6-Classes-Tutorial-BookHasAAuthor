public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String n, Author author, double p, int qty){
        name = n;
        this.author = author;
        price = p;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int q){
        qty = q;
    }

    public String toString(){
        return "'" + name + "' by " + author.toString();
    }

}
