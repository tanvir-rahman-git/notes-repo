class StoryBook extends Book {

private String category;

StoryBook( ){

}

StoryBook(String isbn1, String bookTitle1, String authorName1, double price1, int availableQuantity1,
String category1){
  
super(isbn1, bookTitle1, authorName1 , price1, availableQuantity1);
this.category = category1;
}

void setCategory(String category1){
  this.category = category1;
}

String getCategory( ){
  return category;
}

}