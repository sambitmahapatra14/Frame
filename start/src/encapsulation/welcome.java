package encapsulation;
import java.util.Scanner;

public class welcome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter radius");
		fghj(10);
		double res=scan.nextDouble();
		System.out.println("area is"+res);
	}
	public static void fghj(int radius) {
		double area=3.14*radius*radius;
	}

}
