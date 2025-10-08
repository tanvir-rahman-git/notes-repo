public class BankMain
{
	public static void main(String[] args)
	{
		Bank b1=new Bank(1,"DBBL");
		//b1.show();
		Account a1=new Account("aaa","Mr.M",6597846);
		b1.addAccount(a1);
		Account a2=new Account("bbb","Ms.N",239493);
		b1.addAccount(a2);
		Account a3=new Account("ccc","Mr.O",9878462);
		b1.addAccount(a3);
	
		//a1.show();
		b1.show();


		b1.searchAccount("ccc");

		b1.removeAccount(a3);

		b1.show();


		
	}
}


