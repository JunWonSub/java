package Exercise;

import java.util.Scanner;

public class Application4 {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ���� 10���� �Է��Ͻÿ�>>");
		for(int i = 0; i < 10; i++) {
			intArray[i] = scan.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int i = 0; i < 10; i++) {
			if (intArray[i]%3 == 0)
				System.out.print(intArray[i] + " ");
		}
	}
}
