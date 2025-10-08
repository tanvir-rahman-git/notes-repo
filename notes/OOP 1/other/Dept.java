public abstract class Dept
{
	protected String deptName;
	protected int creditFee;
	public Dept(String deptName,int creditFee)
	{
		this.deptName=deptName;
		this.creditFee=creditFee;
		
	}
	public void show()
	{
		System.out.println("Dept Name: "+deptName);
		System.out.println("CreditFee: "+creditFee);
	}
	
	public abstract void calculateSemesterFee(int credit);
	
	
}