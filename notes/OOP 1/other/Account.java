public class Account 
{
	private	int accountNumber;
	private String name;
	private int age;
	private String nationality;
	private double balance;
	private double phonenumber;
	
	public Account()
	{
      System.out.println("Default Constructor-" +"\n");		
	}
	public Account(int accountNumber,String name,int age,String nationality,double balance,double phonenumber)
	{//Valued constructor
		System.out.println("Valued Constructor-");
		this.accountNumber=accountNumber;
		this.name=name;
		this.age=age;
		this.nationality=nationality;
		this.balance=balance;
		this.phonenumber=phonenumber;
	}
	public void Value(int accountNumber,String Name,int age,String nationality,double balance,double phonenumber)//setter method
	{
		System.out.println("Method-");
		this.accountNumber=accountNumber;
		this.name=name;
		this.age=age;
		this.nationality=nationality;
		this.balance=balance;
		this.phonenumber=phonenumber;
	}
	//getter method
    public int getAccountNumber(){return accountNumber;}
    public String getName(){return name;}
	public int getAge(){return age;}
	public String getNationality(){return nationality;}
    public double getBalance(){return balance;}
	public double getPhonenumber(){return phonenumber;}

public void show(){
	System.out.println("ACCOUNT Holder ID NUMBER: " +this.accountNumber);
	System.out.println("ACCOUNT Holder NAME: " +this.name);
	System.out.println("ACCOUNT Holder Age: " +this.age);
	System.out.println("ACCOUNT Holder Nationality: " +this.nationality);
	System.out.println("Account Holder BALANCE: " +this.balance);
	System.out.println("ACCOUNT Holder Contact Number: " +this.phonenumber +"\n");
}
}
