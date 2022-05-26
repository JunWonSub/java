package Exercise;

import java.util.Scanner;

public class ArryAccess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		for(int i = 0; i < 5; i++) {
			intArray[i] = scan.nextInt();
			if (max < intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다");
	}
}
