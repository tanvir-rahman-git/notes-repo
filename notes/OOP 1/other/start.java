import java.util.Scanner;
public class start
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		textbook b1[] = new textbook[5];
		
		for (int i=0; i<b1.length; i++)
		{
			System.out.print("ISBN: ");
			String is=input.next();
			System.out.println("International Standard Book Number: "+isbn);
			
			System.out.print("Book title: ");
			String bT=input.next();
			System.out.println(" Book Title is "+bookTitle);
			
			System.out.print("Author Name: ");
			String aN=input.next();
			System.out.println("Author Name is  "+authorName);
			
			System.out.print("Price: ");
			double p=input.nextDouble();
			System.out.println("Price is "+price+"tk");
			
			System.out.print("Available Quantity: ");
			int AQ = input.nextInt();
			System.out.println("Available Quantity "+availableQuantity+" piece");
			
			System.out.print("Add Quantity: ");
			int addQuantity = input.nextInt(); 
			
			System.out.print("Sold Quantity: ");
			int sellQuantity = input.nextInt();
			
			
			System.out.print("\n");
			
			b1[i] = new textbook(is, bT, aN, p, AQ);
			b1[i].showDetails();
			b1[i].addQuantity(addQuantity);
			b1[i].sellQuantity(sellQuantity); 
		}
	}
}