public class FixedAccount extends Account
{
	private int tenureYear;
	public FixedAccount(){}
	public FixedAccount(String accountno,double balance,int tenureYear)
	{
		super(accountno,balance);
		this.tenureYear=tenureYear;
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
}