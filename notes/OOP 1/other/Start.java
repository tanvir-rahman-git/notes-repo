public class Start
{
	public static void main(String[] args)
	{
		Account a1=new Account("11-q",45353);
		SavingsAccount s1=new SavingsAccount("42-a",56667,7.5); 
		FixedAccount f1=new FixedAccount("4-b",500000,5); 
		Customer c1=new Customer(1313,"Mr. X",3);
		c1.addAccount(a1);
		c1.addAccount(s1);
		c1.addAccount(f1);
		c1.showAllAccounts();
		
		Account a2=new Account("12-q",45353);
		//SavingsAccount s2=new SavingsAccount("32-a",56667,7.5); 
		FixedAccount f2=new FixedAccount("5-b",500000,5); 
		
		Customer c2=new Customer(1313,"Ms. Y",5);
		c2.addAccount(a2);
		c2.addAccount(f2);
		c2.showAllAccounts();
	}
}