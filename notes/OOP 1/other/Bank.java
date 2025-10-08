public class Bank
{
	private int bankId;
	private String bankName;
	private Account[] acc;
	private int counter;
	
	public Bank(int bankId,String bankName)
	    {
		this.bankId=bankId;
		this.bankName=bankName;
		acc=new Account[100];
	    }
	public void addAccount(Account acc)
	    {
		if(counter<this.acc.length)
		{
			this.acc[counter]=acc;
			counter++;
		}
		
	    }

    public boolean removeAccount(Account acc)
	    {
		for(int i=0;i<counter;i++)
		{
		if(this.acc[i]==acc)
		{
			System.out.println("\n"+"Removed"+this.acc+ "\n" + "Bank Info Updated.......");
			this.acc[i]=this.acc[--counter];
			return true; 
		}
		}
		    return false;
	    }
    public Account searchAccount(String id)
	    {
		Account ob=new Account();
		for(int i=0;i<counter;i++)
	    {
		if(this.acc[i].getId()==id)
		{
		System.out.println("\n"+"Account Searched and Found : ....... ");
		this.acc[i].show();
		ob=this.acc[i]; 
		}
		}
		return ob;
        }	
    public void show()
	    {
		System.out.println("Bank Info.........");
		System.out.println("ID :"+this.bankId);
		System.out.println("Bank Name :"+this.bankName);
		for(int i=0;i<counter;i++)
		{
			this.acc[i].show();
		}
	
		
	    }

}
