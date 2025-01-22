package day11.test.p_20;

import java.util.Scanner;

public class BankApplication {
    static Scanner input = new Scanner(System.in);
    static int accountsNumber = 0;
    static Account[] accounts = new Account[100];

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            Menu();
            System.out.print("선택> ");
            int num = Integer.parseInt(input.nextLine());
            switch (num) {
                case 1:
                    Case1();
                    break;

                case 2:
                    Case2();
                    break;

                case 3:
                    Case3();
                    break;

                case 4:
                    Case4();
                    break;

                case 5:
                    Case5();
                    run = false;
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("-".repeat(50));
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("-".repeat(50));
    }

    public static void Case1() {
        System.out.println("-".repeat(10));
        System.out.println("계좌생성");
        System.out.println("-".repeat(10));

        System.out.print("계좌번호: ");
        String accountNumber = input.nextLine();
        System.out.print("계좌주: ");
        String name = input.nextLine();
        System.out.print("초기임금액: ");
        int deposit = Integer.parseInt(input.nextLine());
        Account account = new Account(accountNumber, name, deposit);
        accounts[accountsNumber++] = account;
        System.out.println("결과: 계좌가 생성되었습니다.");

    }

    public static void Case2() {
        System.out.println("-".repeat(10));
        System.out.println("계좌목록");
        System.out.println("-".repeat(10));
        System.out.println();

        for (int i = 0; i < accountsNumber; i++) {
            System.out.println(accounts[i].getAccountNumber() + "\t"
                    + accounts[i].getName() + "\t" + accounts[i].getBalance());
        }
    }

    public static void Case3() {
        System.out.println("-".repeat(10));
        System.out.println("예금");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String accountNumber = input.nextLine();
        System.out.print("예금액: ");
        int deposit = Integer.parseInt(input.nextLine());
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                int balance = account.getBalance();
                balance += deposit;
                account.setBalance(balance);
                System.out.println("예금이 성공되었습니다.");
                break;
            }
        }

    }

    public static void Case4() {
        System.out.println("-".repeat(10));
        System.out.println("출금");
        System.out.println("-".repeat(10));
        System.out.print("계좌번호: ");
        String accountNumber = input.nextLine();
        System.out.print("출금액: ");
        int deposit = Integer.parseInt(input.nextLine());
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                int balance = account.getBalance();
                if (balance < deposit) {
                    System.out.println("결과: 출금에 실패했습니다. (잔액<출금액)");
                    break;
                } else {
                    balance -= deposit;
                    account.setBalance(balance);
                    System.out.println("결과: 출금이 성공되었습니다.");
                    break;
                }
            }
        }
    }

    public static void Case5() {
        System.out.println("프로그램 종료");
    }
}
