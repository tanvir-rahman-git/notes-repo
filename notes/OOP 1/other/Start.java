public class Start{
	public static void main(String[] args){
		
		//StoryBook
		
		StoryBook s1= new StoryBook();

		StoryBook s2= new StoryBook("998-0-4848-1325-7","The Guest List","Lucy Foley",50.22,13,"Mystery");
		s2.showDetails();
		s2.addQuantity(4);
		s2.sellQuantity(10);
		s2.setDiscountRate(9.99);
		
		//isbn,String bookTitle,String authorName,double price,int availableQuantity, String category
		
		//TextBook
		
		TextBook a1= new TextBook();
		
		TextBook b1= new TextBook("668-5-985-7", "HSC Math 1st Part","S.U Ahmed",350.05,11,8);
		b1.showDetails();
		b1.addQuantity(4);
		b1.sellQuantity(11);
		b1.setDiscountRate(21.00);
		
		
		
		//isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard
	}
}