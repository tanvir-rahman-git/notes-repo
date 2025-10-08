class Book
{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	Book()
	{
		System.out.println("Default Constructor");
	}
 	Book(String is, String bT, String aN, double p, int aQuan)
	{
		isbn=is;
		bookTitle=bT;
		authorName=aN;
		price=p;
		availableQuantity=aQuan;
	}
	public void setIsbn(String is)
	{
		isbn=is;
	}	
    public void setBookTitle(String bT)
	{
		bookTitle=bT;
	}	
    public void setAuthorName(String aN)
	{
		authorName=aN;
	}	
    public void setPrice(double p)
	{
		price=p;
	}	
    public void setAvaiableQuantity(int aQuan)
	{
		availableQuantity=aQuan;
	}	
	
	public String getIsbn()
	{
		return isbn;
	}	
    public String getBookTitle()
	{
		return bookTitle;
	}	
    public String getAuthorName()
	{
		return authorName;
	}	
    public double getPrice()
	{
		return price;
	}	
    public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	
	public void addQuantity(int amount)
	{
		availableQuantity = availableQuantity + amount;
		System.out.println("After adding there are: "+availableQuantity +" books");
	}	
    public void sellQuantity(int amount)
	{
		availableQuantity = availableQuantity - amount;
		System.out.println("After selling there are: "+availableQuantity +" books"+"\n");
	}

	public void showDetails()
	{
		System.out.println("ISBN: "+isbn);
		System.out.println("Book Title: "+bookTitle);
		System.out.println("Author Name: "+authorName);
		System.out.println("Price: "+price);
		System.out.println("Available Quantity: "+availableQuantity);
	}
}