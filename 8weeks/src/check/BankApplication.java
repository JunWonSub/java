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
				System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
				System.out.println("--------------------------------------------");
				System.out.print("���� > ");
				
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
			System.out.println("���α׷� ����");
	}

		// ���� �����ϱ�
		private static void createAccount(int i) {
			// �ۼ� ��ġ
			System.out.println("------------------");
			System.out.println("���»���");
			System.out.println("------------------");
			System.out.print("���¹�ȣ : ");
			String accountAno = scanner.next();
			System.out.print("������ : ");
			String accountOwner = scanner.next();
			System.out.print("�ʱ��Աݾ� : ");
			int accountBalance = scanner.nextInt();
			
			Account2 account = new Account2(accountAno, accountOwner, accountBalance);
			accountArray[i] = account;
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		}
		
		// ���� ��� ����
		private static void accountList() {
			// �ۼ� ��ġ
			System.out.println("------------------");
			System.out.println("���¸��");
			System.out.println("------------------");
			for(int j = 0; j <= accountArray.length; j++) {
				
			}
		}
		
		// �����ϱ�
		private static void deposit() {
			// �ۼ� ��ġ
			System.out.println("------------------");
			System.out.println("����");
			System.out.println("------------------");
			
		}
		
		// ����ϱ�
		private static void withdraw() {
			// �ۼ� ��ġ
			System.out.println("------------------");
			System.out.println("���");
			System.out.println("------------------");
			
		}
		
		// Account �迭���� ano�� ������ Account ��ü ã��
		private static Account2 findAccount(String ano) {
			// �ۼ� ��ġ
			Account2 account = null;
			return account;
		}
}