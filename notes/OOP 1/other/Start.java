import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		TextBook tb1 = new TextBook("978-0-5-10190", "Discrete Mathematics", "oscar levin.", 1500.0, 2, 3);
		TextBook tb2 = new TextBook("978-0-1-20180", "Object Oriented Programming 1", "Dr.anonymous", 1250.0, 3, 4);
		TextBook tb3 = new TextBook("978-0-9-30170", "Introduction to electrical circuit", "Dr.number 1", 1750.0, 4, 5);
		TextBook tb4 = new TextBook("978-0-5-40160", "Physics", "Dr.amir hossen", 500.0, 5, 6);
		TextBook tb5 = new TextBook("978-0-4-50150", "Effective Modern C++", "Scott Meyers", 5000.0, 6, 7);
		
		StoryBook sb1 = new StoryBook("978-0-5-10190", "To Kill a Mockingbird", "Harper Lee", 1200.0, 2, "Life");
		StoryBook sb2 = new StoryBook("978-0-4", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 2000.0, 3, "Immaginary");
		StoryBook sb3 = new StoryBook("978-0-3", "The Great Gatsby", "F. Scott Fitzgerald", 1000.0, 4, "Historical");
		StoryBook sb4 = new StoryBook("978-0-2", "One Hundred Years of Solitude", "Gabriel García Márquez", 800.0, 5, "adventure");
		StoryBook sb5 = new StoryBook("978-0-1", "Beloved", "Toni Morrison", 600.0, 6, "Life story");
		
		BookShop b = new BookShop("International Bookshop-Bangladesh");
		b.showDetails();
	
		
		System.out.println("----------------------------------------");
		if(b.insertBook(tb1)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(tb2) ){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(tb3)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(tb4)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(tb5)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		
		if(b.insertBook(sb1)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(sb2) ){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(sb3)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(sb4)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		
		if(b.insertBook(sb5)){System.out.println("Book Insertted");}
		else{System.out.println("Can NOT be Inserted");}
		System.out.println("----------------------------------------");
		
		b.showDetails();
		
		System.out.println("-----------------------------------------");
		if(b.removeBook(tb1)){System.out.println("Book Removed");}
		else{System.out.println("Can NOT be Removed");}
		
		if(b.removeBook(sb3) ){System.out.println("Book Removed");}
		else{System.out.println("Can NOT be Removed");}
		System.out.println("------------------------------------------");
		
		b.showDetails();
		
		System.out.println("------------------------------------------");
		Book b1 = b.searchBook("978-0-5-10190");
		
		if(b1 != null)
		{
			System.out.println("Object Found....");
			b1.showDetails();
		}
		else
		{
			System.out.println("Object NOT Found....");
		}
		
		Book b2 = b.searchBook("978-0-13-601970-1");
		
		if(b2 != null)
		{
			System.out.println("Object Found....");
			b2.showDetails();
		}
		else
		{
			System.out.println("Object NOT Found....");
		}
		System.out.println("-------------------------------------------");

	}
}