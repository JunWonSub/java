
import java.util.Scanner;

public class Number03 {
	public static void main(String[] args) {
		double a;
		double b;
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x값 : ");
		a= stdIn.nextDouble();
		System.out.print("y값 : ");
		b= stdIn.nextDouble();
		
		double sum;
		sum = a + b;
		
		System.out.println("합계는 " + sum + "입니다.");
		
	}
}
