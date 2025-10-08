public class Account
{
	protected String accountno;
	protected double balance;
	public Account(String accountno,double balance)
	{
		this.accountno=accountno;
		this.balance=balance;
	}
	public Account()
	{
		System.out.println("Default");
	}
	
	public void setAccounNo(String accountno)
	{
		this.accountno=accountno;
		
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getAccountNo()
	{
		return accountno;
	}
	public double getBalance()
	{
		return balance;
	}
}
