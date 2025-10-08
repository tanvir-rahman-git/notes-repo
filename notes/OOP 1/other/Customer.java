public class Customer
{
	private int nid;
	private String name;
	private Account accounts[];//association// 1 to many
	private int counter;
	public Customer()
	{
	}
	public Customer(int nid,String name,int size)
	{
		this.nid=nid;
		this.name=name;
		this.accounts=new Account[size];
	}
	public void addAccount(Account a1)
	{
		if(counter<accounts.length)
		{
			accounts[counter]=a1;
			counter++;
		}
	}
	
	public void showAllAccounts()
	{
		System.out.println("Customer Details:......");
		System.out.println("Nid: "+this.nid);
		System.out.println("Name: "+this.name);
		System.out.println("His/Her Account details:");
		for(int i=0;i<counter;i++)
		{
			System.out.println("AccountNo: "+accounts[i].getAccountNo());
			System.out.println("AccountNo: "+accounts[i].getBalance());
			
		}
		
	}
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getNid()
	{
		return nid;
	}
	public String  getName()
	{
		return name;
	}
}