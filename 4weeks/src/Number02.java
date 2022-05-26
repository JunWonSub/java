import java.util.Scanner;

public class Number02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수값");
		int num = stdIn.nextInt();
		
		int result1 = (num - (num%10))/10;
		System.out.println("마지막 자릿수를 제외한 값은 "+ result1 + " 입니다");
		int result2 = num %10;
		System.out.println("마지막 자릿수는 "+ result2 + " 입니다");
		
	}
}
