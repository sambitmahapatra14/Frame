package start;

public class table {
	public static void table(int num,int till) {
		int i,res;
		for(i=1;i<=till;i++)
		{
			res=i*num;
			System.out.println(num+"*"+i+"="+res);
			
		}
	}
	public static void main(String[] args) {
		table(5,10);
	}

}
