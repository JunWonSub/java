import java.util.Scanner;

public class Number02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������");
		int num = stdIn.nextInt();
		
		int result1 = (num - (num%10))/10;
		System.out.println("������ �ڸ����� ������ ���� "+ result1 + " �Դϴ�");
		int result2 = num %10;
		System.out.println("������ �ڸ����� "+ result2 + " �Դϴ�");
		
	}
}
