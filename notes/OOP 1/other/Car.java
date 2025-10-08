//import java.lang.Math;
public class Car implements Vehicle
{
	String fuelType;
	
	public void setSeatNo(int seatNo)
	{
		//this.seatNo=seatNo;
		//System.out.println(" SeatNo :"+this.seatNo);
	}
	public void setFuelType(String fuelType)
	{
		this.fuelType=fuelType;
	}
    public void show()
	{
		System.out.println("SeatNo: "+seatNo);
		System.out.println("Fuel Type: "+fuelType);
		
	}
}