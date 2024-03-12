package check.Q20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accountArray = new Account[100];
		Scanner sc = new Scanner(System.in);

		String strNum;

		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			strNum = sc.nextLine();

			if (strNum.equals("1")) {
				while (true) {
					System.out.println("---------------------------------");
					System.out.println("계좌 생성");
					System.out.println("---------------------------------");
					System.out.print("계좌번호: ");
					String ano = sc.nextLine();
					if (ano.equals("")) {
						System.out.println("유효하지 않은 값입니다.");
						continue;
					}

					System.out.print("계좌주: ");
					String owner = sc.nextLine();
					if (owner.equals("")) {
						System.out.println("유효하지 않은 값입니다.");
						continue;
					}

					System.out.print("초기 입금액: ");
					String strBalance = sc.nextLine();
					if (strBalance.equals("")) {
						System.out.println("유효하지 않은 값입니다.");
						continue;
					}
					int balance = Integer.parseInt(strBalance);
					Account newAccount = new Account(ano, owner, balance);
					for (int i = 0; i < accountArray.length; i++) {
						if (accountArray[i] == null) {
							accountArray[i] = newAccount;
							System.out.println("계좌가 생성되었습니다.");
							break;
						}
					}
					break;
				}

			} else if (strNum.equals("2")) {
				System.out.println("---------------------------------");
				System.out.println("계좌 목록");
				System.out.println("---------------------------------");

				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] != null) {
						System.out.print(accountArray[i].getAccountNum() + "  ");
						System.out.print(accountArray[i].getName() + "  ");
						System.out.println(accountArray[i].getBalance());
					}

				}

			} else if (strNum.equals("3")) {
				while (true) {
					System.out.println("---------------------------------");
					System.out.println("예금");
					System.out.println("---------------------------------");
					System.out.print("계좌 번호 > ");
					String ano = sc.nextLine();
					if (ano.equals("")) {
						System.out.println("유효하지 않은 값입니다.");
						continue;
					}
					System.out.print("예금액 > ");
					String strBalance = sc.nextLine();
					if (strBalance.equals("")) {
						System.out.println("유효하지 않은 값입니다.");
						continue;
					}
					int balance = Integer.parseInt(strBalance);
					for (int i = 0; i < accountArray.length; i++) {
						if (accountArray[i] != null && accountArray[i].getAccountNum().equals(ano)) {
							int sum = accountArray[i].getBalance();
							sum += balance;
							accountArray[i].setBalance(sum);
							System.out.println("예금을 완료했습니다.");
						}
					}
					break;
				}

			} else if (strNum.equals("4")) {
				while (true) {
					System.out.println("---------------------------------");
					System.out.println("출금");
					System.out.println("---------------------------------");
					System.out.print("계좌번호 > ");
					String ano = sc.nextLine();
					if (ano.equals("")) {
						System.out.println("유효하지 않은 값입니다.");
						continue;
					}
					System.out.print("출금액 > ");
					String strWithdraw = sc.nextLine();
					if (strWithdraw.equals("")) {
						System.out.println("유효하지 않은 값입니다.");
						continue;
					}
					int withdraw = Integer.parseInt(strWithdraw);
					for (int i = 0; i < accountArray.length; i++) {
						if (accountArray[i] != null && accountArray[i].getAccountNum().equals(ano)) {
							int sum = accountArray[i].getBalance();
							sum -= withdraw;
							accountArray[i].setBalance(sum);
							System.out.println("출금을 완료했습니다.");
						}
					}
					break;
				}

			} else if (strNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
