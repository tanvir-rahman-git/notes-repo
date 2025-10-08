public class B extends A
{
	public int y;
	
	public B(int y)
	{
		this.y=y;
		System.out.println("Constructor of B"); 
	}
	public void show()
	{
		System.out.println("Value of y: "+y);
	}
}
