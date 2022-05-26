package Exercise;

import java.util.Scanner;

public class Application4 {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의 정수 10개를 입력하시오>>");
		for(int i = 0; i < 10; i++) {
			intArray[i] = scan.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int i = 0; i < 10; i++) {
			if (intArray[i]%3 == 0)
				System.out.print(intArray[i] + " ");
		}
	}
}
