import java.util.Scanner;

public class Number04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇개의 * 를 표시할까요?");
		int n = stdIn.nextInt();
		if(n>=0){		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}		
			
		}
		else {
			System.out.println("다시 입력하세요");
		}
		}

			
}


