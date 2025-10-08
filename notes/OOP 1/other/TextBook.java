public class TextBook
{
	String isbn;
	String bookTitle;
	String authorName;
	double price;
	int availableQuantity;
	int standard;
	static double discountRate;
	
	TextBook(){
		System.out.println("Defult Constructor\n");
	}
	
	TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
	{
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
		this.standard=standard;
	}
	static void setDiscountRate(double rate)
	{
		discountRate=rate;
	 System.out.println("Discount Rate:" +rate);
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
	void setStandard(int standard)
	{
		standard=standard;
	}
	String getIsbn()
	{
		return isbn;
	}
	String getBookTitle()
	{
		return bookTitle;
	}
	String getAuthorName()
	{
		return authorName;
	}
	double getPrice()
	{
		return price;
	}
	int getAvailableQuantity()
	{
		return availableQuantity;
	}
	int getStandard()
	{
		return standard;
	}
	void addQuantity(int amount){
		System.out.println("Add Quantity: " +amount);
		availableQuantity=availableQuantity+amount;
		System.out.println("Total Quantity: " +availableQuantity);
	}
    void sellQuantity(int amount){
	System.out.println("Sold Quantity: " +amount);
	availableQuantity=availableQuantity-amount;
    System.out.println("Sold Quantity: " +availableQuantity);
	}
	void showDetails(){
		System.out.println("ISBN: " +isbn);
		System.out.println("Book Title: " +bookTitle);
		System.out.println("Author Name: " +authorName);
		System.out.println("Price: " +price+"TK.");
		System.out.println("Available Quantity: " +availableQuantity);
		System.out.println("Standard: " +standard+"Th");
	}	
}