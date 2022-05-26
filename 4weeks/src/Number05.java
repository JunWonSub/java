import java.util.Scanner;

public class Number05 {
		public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다");
		System.out.println("윗변의 별표 갯수는 : ");
		int n = stdIn.nextInt();
		for(int a=0; a<n; a++) {
			for(int b= n; b>0; b--) {
				if(a>=b) {
					System.out.print("");
					
				}
				else {System.out.print("*");
			
				}
			}
			System.out.println();
		}
		
		
		}
}