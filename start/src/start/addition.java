package start;

public class addition {
	public static int add(int a,int b) 
	{
		int addd=a+b;
		System.out.println(a+"+"+b+"is"+addd);
		
		return 30 ;
		
	}
	public static char div(int a,int b) {
		double divv=a/b;
		System.out.println(a+"/"+b+"is"+divv);
		return 'a';
	}
	
	
	
	public static void main(String[] args) {
		add(6,2);
		div(6,2);
	}

}
