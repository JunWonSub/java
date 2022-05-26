package check;

import java.util.Scanner;

public class BankApplication {
		private static Account2[] accountArray = new Account2[100];
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String [] args) {
			boolean run = true;
			int i = 0;
			while(run) {
				System.out.println("--------------------------------------------");
				System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
				System.out.println("--------------------------------------------");
				System.out.print("선택 > ");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo == 1) {
					createAccount(i);
					i++;
				} else if(selectNo == 2) {
					accountList();
				} else if(selectNo == 3) {
					deposit();
				} else if(selectNo == 4) {
					withdraw();
				} else if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
	}

		// 계좌 생성하기
		private static void createAccount(int i) {
			// 작성 위치
			System.out.println("------------------");
			System.out.println("계좌생성");
			System.out.println("------------------");
			System.out.print("계좌번호 : ");
			String accountAno = scanner.next();
			System.out.print("계좌주 : ");
			String accountOwner = scanner.next();
			System.out.print("초기입금액 : ");
			int accountBalance = scanner.nextInt();
			
			Account2 account = new Account2(accountAno, accountOwner, accountBalance);
			accountArray[i] = account;
			System.out.println("결과 : 계좌가 생성되었습니다.");
		}
		
		// 계좌 목록 보기
		private static void accountList() {
			// 작성 위치
			System.out.println("------------------");
			System.out.println("계좌목록");
			System.out.println("------------------");
			for(int j = 0; j <= accountArray.length; j++) {
				
			}
		}
		
		// 예금하기
		private static void deposit() {
			// 작성 위치
			System.out.println("------------------");
			System.out.println("예금");
			System.out.println("------------------");
			
		}
		
		// 출금하기
		private static void withdraw() {
			// 작성 위치
			System.out.println("------------------");
			System.out.println("출금");
			System.out.println("------------------");
			
		}
		
		// Account 배열에서 ano와 동일한 Account 객체 찾기
		private static Account2 findAccount(String ano) {
			// 작성 위치
			Account2 account = null;
			return account;
		}
}