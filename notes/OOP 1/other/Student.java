class Student
{
	private	String id;
	private  String name;
	private double cgpa;
	
	/*public void setValues(String id,String name,double cgpa )
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}*/
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void show()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("CGPA:"+cgpa);
	}		
	

}