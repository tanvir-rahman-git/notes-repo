import java.lang.*;

public class BookShop implements  BookShopOperations
{
	private String name;
	private Book listOfBooks[] = new Book[100];
	public BookShop(){}
	public BookShop(String name)
	{
		this.name =name;
	}	
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}	
	
	public boolean insertBook(Book b) 
	{
		for(int i=0; i<listOfBooks.length; i++)
		{
		if(listOfBooks[i] == null)
		{
		listOfBooks[i] = b;
		return true;
		}
		}
	return false;
  	}
	
	public boolean removeBook(Book b)
  	{
		for(int i=0; i<listOfBooks.length; i++)
		{
		if(listOfBooks[i] == b)
		{
		listOfBooks[i] = null;
		return true;
		}
		}
	return false;
   }	
	
	public void showAllBooks() 
   {
		for(int i=0; i<listOfBooks.length; i++)
		{
		if(listOfBooks[i] != null)
		{
		listOfBooks[i].showDetails();
			System.out.println("_______________________________");
		}
		}
   	}
			
	public Book searchBook(String isbn) 
    {
		for(int i=0; i<listOfBooks.length; i++)
		{
		if(listOfBooks[i] != null)
		{
		if(listOfBooks[i].getIsbn().equals(isbn))
		{
		return listOfBooks[i];
		}
		}
		}
	return null;
    }
	
	
	public void showDetails()
    {
		System.out.println("Book shop Name: " + this.name);
		System.out.println("---- Book ----");
		this.showAllBooks();
		System.out.println("_______________________________");
    }	
}