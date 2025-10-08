class Book{

private String isbn;
private String bookTitle;
private String authorName;
private double price;
private int availableQuantity;


Book( ){
           System.println.out("empty constructor   :-")
};
Book(String isbn1, String bookTitle1, String authorName1, double price1, int availableQuantity1){

this.isbn = isbn1 ;
this.bookTitle =  bookTitle1 ;
this.authorName = authorName1 ;
this.price = price1 ;
this.availableQuantity = availableQuantity1 ;

}
void setIsbn(String isbn1){

this.isbn = isbn1 ;

}
void setBookTitle(String bookTitle1){

this.bookTitle =  bookTitle1 ;

}
void setAuthorName(String authorName1){

this.authorName = authorName1 ;

}
void setPrice(double price1){

this.price = price1 ;

}
void setAvaiableQuantity(int availableQuantity1){

this.availableQuantity = availableQuantity1 ;

}
String getIsbn( ){

return isbn;

}
String getBookTitle( ){

return bookTitle;

}
String getAuthorName( ){

return authorName;

}
double getPrice( ){

return price;

}
int getAvailableQuantity( ){

return availableQuantity;

}
void addQuantity(int amount){

this.availableQuantity = availableQuantity + amount;
System.out.println( amount + "books has been added. New available book quantity is      : " + availableQuantity);

}
void sellQuantity(int amount){

this.availableQuantity = availableQuantity - amount;
System.out.println( amount + "books has been sold. New available book quantity is       : " + availableQuantity);

}
void showDetails( ){

  System.out.println("isbn              : " + isbn + " .");  
  System.out.println("bookTitle         : " + bookTitle + " .");  
  System.out.println("authorName        : " + authorName + " .");  
  System.out.println("price             : " + price + " .");  
  System.out.println("availableQuantity : " + availableQuantity + " . \n \n");  

}

}