import java.util.Scanner;
public class Start
{
	public static void main(String[] args)
	{
		Scanner sin=new Scanner(System.in);
		Book b1[] = new Book[5];
		
		for (int i=0; i<b1.length; i++)
		{
			System.out.print("ISBN: ");
			String is=sin.next();
			System.out.print("Book title: ");
			String bT=sin.next();
			System.out.print("Author Name: ");
			String aN=sin.next();
			System.out.print("Price: ");
			double p=sin.nextDouble();
			System.out.print("Available Quantity: ");
			int aQuan = sin.nextInt();
			
			System.out.print("Add Quantity: ");
			int addQuantity = sin.nextInt(); 
			System.out.print("Sold Quantity: ");
			int sellQuantity = sin.nextInt();
			System.out.print("\n");
			
			b1[i] = new Book(is, bT, aN, p, aQuan);
			b1[i].showDetails();
			b1[i].addQuantity(addQuantity);
			b1[i].sellQuantity(sellQuantity); 
		}
	}
}