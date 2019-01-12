package start;

public class square {
	public static double area(double radius)
	{
		double area=3.14*radius*radius;
		System.out.println("if radius is "+radius);
		return area;
		
		
	}

	public static void main(String[] args)
	{
	double d=area(3.2);
	System.out.println("area is"+d);
	
	}

}
