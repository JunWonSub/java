package Exercise;

import java.util.Scanner;

public class ArryLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		double avg = sum / 5.0; 
		System.out.println("Æò±ÕÀº " + avg);
	}
}
