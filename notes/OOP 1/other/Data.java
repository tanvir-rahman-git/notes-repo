public class Data
{
	public static void main(String[] args)
	{   
	    int i3;
		byte b1=10,b2=20;
		short s1=100,s2=20;
	    i3=s1+s2;;
		int i1=10000,i2=0;
		String a="123";
		System.out.println("short add result :\t"+i3);
		
		 i3=(byte)s1+(byte)s2;
		System.out.println("b2:"+b2+"\n"); 
		long l1=122222222222L,l2=122289898989L;
		i3=(int)l1+i2;
		System.out.println("int sum:"+i3+"\n");
		int b=Integer.parseInt(a)+i1;
		System.out.println("Result String: "+b);
		//System.out.println(b1+"byte\n"+s1+"Short\n"+i1+"Integer\n"+l1+"Long\n");
	}
}