interface Vehicle  //By default public
{
	int seatNo=10;//Initialization must// public,static,final 
	void setSeatNo(int seatNo);//public,abstract
	void setFuelType(String fuelType);//public,abstract
    void show();//public,abstract
	static void showA()
	{
		System.out.println("its Show A func");
	}
	
}