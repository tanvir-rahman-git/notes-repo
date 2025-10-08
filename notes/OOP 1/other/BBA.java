public class BBA extends Dept
{
	public BBA(String deptName,int creditFee)
	{
		super(deptName,creditFee);
	}
	
	public void calculateSemesterFee(int credit)
	{
		System.out.println("Semester Fee: "+credit*creditFee);
	}
	


	 
}