import java.util.Scanner;

public class Number05 {
		public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�");
		System.out.println("������ ��ǥ ������ : ");
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