class TextBook extends Book {

private int standard;

TextBook( ) {

}
TextBook(String isbn1, String bookTitle1, String authorName1, double price1, int availableQuantity1,
int standard1){

super(isbn1, bookTitle1, authorName1 , price1, availableQuantity1);
this.standard = standard1;


}
void setStandard(int standard1){
  this.standard = standard1;
}
int getStandard( ){
  return standard;
}

}