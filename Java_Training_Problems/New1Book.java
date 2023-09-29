class New1Book {
    int isbnNo;
    String bookName;
    String author;
    String genre;
    float price;
    // Declare required constructors
    public New1Book(int isbnNo1,String bookName1,String author1,String genre1,float price1){
        isbnNo=isbnNo1;
        bookName=bookName1;
        author=author1;
        genre=genre1;
        price=price1;
    }
    // create a method to print book details
	public void printBookDetails(){
	System.out.println("isbn no.: "+isbnNo);

	System.out.println("Book Name: "+bookName);

	System.out.println("Author: "+author);

    System.out.println("Genre: "+genre);

    System.out.println("Price: "+price);
    
    } 

}





