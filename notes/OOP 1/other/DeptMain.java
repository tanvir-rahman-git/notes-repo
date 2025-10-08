public class DeptMain
{
	public static void main(String[] args)
	{
		//Dept d1=new Dept("A",655665);
	
		BBA d1=new BBA("BBA",4500);
		d1.show();
		d1.calculateSemesterFee(15);
		
		CS c=new CS("CS",4500);
		c.show();
		c.calculateSemesterFee(18);
		
	}
}
