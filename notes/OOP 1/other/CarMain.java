public class CarMain
{
	public static void main(String[] args)
	{
		Vehicle v1;//=new Vehicle();
		v1=new Car();
		v1.setSeatNo(40);
		v1.setFuelType("Octen");
		v1.show();
		Vehicle.showA();
	}
}