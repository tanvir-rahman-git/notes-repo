public class Start
{
	public static void main(String[] args)
	{



StoryBook S2 = new StoryBook("9781781100349", " Harry Potter and the Philosopher's Stone", "J. K. Rowling", 5000000, 10000,
"threaling");



StoryBook S1 = new StoryBook( );

S1.setIsbn("9781781100349");

S1.setBookTitle("Harry Potter and the Philosopher's Stone");

S1.setAuthorName("J. K. Rowling");

S1.setPrice(25000);

S1.setAvaiableQuantity(5000);

S1.setCategory("threaling");

System.out.println("isbn is                    : " + S1.getIsbn());

System.out.println("Book Title is              : " + S1.getBookTitle());

System.out.println("author Name is             : " + S1.getAuthorName());

System.out.println("price is : " + S1.getPrice());

System.out.println("available book quantity is : " + S1.getAvailableQuantity());
System.out.println("Book Category is           : " + S1.getCategory());

S1.addQuantity(100);

S1.sellQuantity(500);

S1.showDetails();




System.out.println("End of storyBook Section          :\n \n \n");



TextBook T2 = new TextBook("8174506314", " Physics Text Book Part 1", "NCERT (Author)", 500000, 10000,
15000);




TextBook T1 = new TextBook( );


T1.setIsbn("8174506314");

T1.setBookTitle("Physics Text Book Part 1 ");

T1.setAuthorName(" NCERT (Author)");

T1.setPrice(1999);

T1.setAvaiableQuantity(1000);

T1.setStandard(9000);

System.out.println("isbn is                    : " + T1.getIsbn());

System.out.println("Book Title is              : " + T1.getBookTitle());

System.out.println("author Name is             : " + T1.getAuthorName());

System.out.println("price is                   : " + T1.getPrice());

System.out.println("available book quantity is : " + T1.getAvailableQuantity());

System.out.println("Book standard is           : " + T1.getStandard());

T1.addQuantity(9);

T1.sellQuantity(5);

T1.showDetails();



	}
}

