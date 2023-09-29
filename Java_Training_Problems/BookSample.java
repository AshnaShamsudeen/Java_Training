public class BookSample {

    //public static  Book findCheapestBook(New1Book Book1,New1Book Book2,New1Book Book3)
    //{
       // Book cheapestBook;
        //if(Book1.price<Book2.price)
        //{
        //    cheapestBook=Book1;
        //}
    //}
    public static void main(String[] args) {
    
        New1Book Book1=new New1Book(123456789,"Kite Runner","Khaled Hosseini","Novel",230);
        New1Book Book2=new New1Book(987654321,"I too had a love story","Raveendar Singh","Romance Novel",310);
        New1Book Book3=new New1Book(129834765,"Alchemist","Paulo Coelho","Novel",240);
        Book1.printBookDetails();
        Book2.printBookDetails();
        Book3.printBookDetails();
        if(Book1.price<Book2.price && Book1.price<Book3.price )
        {
            System.out.println("Cheapest book is " +Book1.bookName);
        }
        else if(Book2.price<Book3.price && Book2.price<Book1.price)
        {
            System.out.println("Cheapest book is " +Book2.bookName);
        }
        else
       {
             System.out.println("Cheapest book is " +Book3.bookName);
       }
    }

}
