public class AccountMain{
	
	public static void main(String[] args)
{       
		Account A1= new Account();
		Account A2= new Account("Mr.A","Na",99999);
		A2.show();
		
		Account A3= new Account("Mr.B","Cl",5555);
		A3.show();
	
	A2.deposit(500);
    A2.withdraw(100);
	A2.transfer(A3,400);
}
}