public class StoryBook{
	 String isbn;
	 String bookTitle;
	 String authorName;
	 double price;
	 int availableQuantity;
	 String category;
	 static double discountRate=2.50;
	
	StoryBook(){
		System.out.println("Defult Constructor \n");
	}
	StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity, String category)
	{
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		this.category=category;
		//discountRate++;
	}
	
	static void setDiscountRate(double rate)
	{
		discountRate=rate;
	 System.out.println("Discount Rate:" +rate +"\n");
	}
	static double getDiscountRate()
	{
	 return discountRate;
	}
	void setIsbn(String isbn)
	{
		isbn=isbn;
	}
    void setBookTitle(String bookTitle)
	{
		bookTitle=bookTitle;
	}
    void setAuthorName(String authorName)
	{
		authorName=authorName;
	}
    void setPrice(double price)
	{
		price=price;
	}
    void setAvaiableQuantity(int availableQuantity)
	{
		availableQuantity=availableQuantity;
	}
    void setCategory(String category)
	{
		category=category;
	}
	
	
	String getIsbn()
	{
		return isbn;
	}
    String getBookTitle(){
		return bookTitle;
	}
    String getAuthorName(){
		return authorName;
	}
    double getPrice(){
		return price;
	}
    int getAvailableQuantity(){
		return availableQuantity;
	}
    String getCategory(){
		return category;
	}
	void addQuantity(int amount){
		System.out.println("Add Quantity: " +amount);
		availableQuantity=availableQuantity+amount;
		System.out.println("Total Quantity: " +availableQuantity);
	}
    void sellQuantity(int amount){
	System.out.println("Sold Quantity: " +amount);
	availableQuantity=availableQuantity-amount;
    System.out.println("Available Quantity: " +availableQuantity);
	}
    void showDetails(){
		System.out.println("ISBN: " +isbn);
		System.out.println("Book Title: " +bookTitle);
		System.out.println("Author Name: " +authorName);
		System.out.println("Price: " +price+"$");
		System.out.println("Available Quantity: " +availableQuantity);
		System.out.println("Category: " +category);
	
	}
}