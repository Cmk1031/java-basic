package day09.bookstore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;
    static Scanner input = new Scanner(System.in);
    static Map<String, Integer> bookCart = new HashMap<>();

    public static void main(String[] args) {
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        /*
        System.out.println("****************************");
        System.out.println("1. 고객정보 확인하기 \t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기 \t8. 종료");
        System.out.println("****************************");
         */

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userPhoneNumber = input.nextLine();
        //사람 만들기!
        Person user = new Person(userName, userPhoneNumber);
        welcomeMessage();
        menuIntroduction();

        System.out.print("메뉴 번호를 선택해주세요 ");
        int n = input.nextInt();
        while (n != 8) {
            if (n < 1 || n > 8) {
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
            } else {
                switch (n) {
                    case 1:
                        menuGuestInfo(user);
                        break;

                    case 2:
                        menuCartItemList();
                        break;

                    case 3:
                        menuCartClear();
                        break;

                    case 4:
                        menuCartAddItem(mBook);
                        break;

                    case 5:
                        menuCartRemoveItemCount();
                        break;

                    case 6:
                        menuCartRemoveItem();
                        break;

                    case 7:
                        menuCartBill(mBook);
                        break;

                    case 8:
                        menuExit();
                        break;

                }
            }
            menuIntroduction();
            System.out.print("메뉴 번호를 선택해주세요 ");
            n = input.nextInt();
        }


    }


    private static void welcomeMessage() {
        System.out.println("****************************************************");
        System.out.println("\tWelcome to Shopping Mall");
        System.out.println("\tWelcome to Book Market!");
    }

    public static void menuIntroduction() {
        System.out.println("****************************************************");
        System.out.println("1. 고객정보 확인하기 \t4. 장바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기 \t8. 종료");
        System.out.println("****************************************************");

    }

    // 1. 고객 정보 확인하기
    public static void menuGuestInfo(Person user) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + user.getName() + ", 연락처 " + user.getPhone());
    }

    // 2. 장바구니 상품 목록 보기
    private static void menuCartItemList() {
        System.out.println("2. 장바구니 상품 목록 보기 ");
        for (Map.Entry<String, Integer> entry : bookCart.entrySet()) {
            String id = entry.getKey();
            Integer cnt = entry.getValue();
            System.out.println("도서 ID: " + id + " 수량: " + cnt);
        }
    }

    // 3. 장바구니 비우기
    private static void menuCartClear() {
        System.out.println("3. 장바구니 비우기");
        bookCart.clear();
        System.out.println("장바구니 Clear");
    }


    // 4. 장바구니에 항목 추가하기
    public static void menuCartAddItem(String[][] book) {
        Scanner input = new Scanner(System.in);
        BookList(book);
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++) {
                System.out.print(book[i][j] + " : ");
            }
            System.out.println("");
        }
        boolean quit = false;
        while (!quit) {
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요: ");
            String id = input.nextLine();
            boolean flag = false;
            int numId = -1;
            for (int i = 0; i < NUM_BOOK; i++) {
                if (id.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                String str;
                System.out.print("장바구니에 추가하시겠습니까? Y|N ");
                str = input.nextLine();

                if (str.toUpperCase().equals("Y")) {
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");
                    int k = bookCart.getOrDefault(id, 0);
                    bookCart.put(id, ++k);

                }
                quit = true;
            } else {
                System.out.println("다시 입력해주세요.");
            }
        }
    }

    // 5. 장바구니의 항목 수량 줄이기
    private static void menuCartRemoveItemCount() {
        System.out.println("5. 장바구니의 항목 수량 줄이기");

        while (true) {
            System.out.print("도서 ID를 입력해주세요.");
            String id = input.next();
            boolean isBookIn = bookCart.containsKey(id);
            if (!isBookIn) {
                System.out.println("해당 도서는 장바구니에 존재하지 않습니다.");
            } else {
                System.out.print("제외할 수량을 입력해주세요.");
                int minusCnt = input.nextInt();
                int cartCnt = bookCart.get(id);
                // 제외 수량 > 장바구니 수량 인 경우
                if (minusCnt > cartCnt) {
                    System.out.println("제외하고자 하는 수량이 더 많습니다!");
                } else {
                    cartCnt -= minusCnt;
                    bookCart.put(id, cartCnt);
                    System.out.println("장바구니의 " + id + " 도서 " + minusCnt + " 권을 제외했습니다.");
                    break;
                }
            }
        }

    }

    //6. 장바구니의 항목 삭제하기
    private static void menuCartRemoveItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("6. 장바구니의 항목 삭제하기");
        System.out.println("삭제할 도서의 ID를 입력해주세요.");
        String id = scanner.nextLine();
        boolean isBookIn = bookCart.containsKey(id);
        //삭제할 도서가 장바구니에 있으면!
        if (isBookIn) {
            bookCart.remove(id);
            System.out.println("해당 도서가 삭제되었습니다.");
        } else { //삭제할 도서가 장바구니에 없는 경우!
            System.out.println("해당 도서는 장바구니에 존재하지 않습니다!");

        }
    }

    //7. 영수증 표시하기
    private static void menuCartBill(String[][] mBook) {
        System.out.println("7. 영수증 표시하기");
        int totalPrice = 0;
        for (Map.Entry<String, Integer> entry : bookCart.entrySet()) {

            String id = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < NUM_BOOK; i++) {
                if (mBook[i][0].equals(id)) {
                    int price = Integer.parseInt(mBook[i][2]);
                    System.out.println("도서명: " + mBook[i][1] + " 수량 : " + count + " 가격: " + price * count);
                    totalPrice += price * count;
                }
            }
        }
        System.out.println("총 가격은 " + totalPrice + "원 입니다. ");

    }

    //8. 종료
    private static void menuExit() {
        System.out.println("8. 종료");

    }


    //도서 정보 메서드
    public static void BookList(String[][] book) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<NUM_BOOK; i++) {
            System.out.printf("%d 번째 정보를 입력하세요: %n", i+1);
            for(int j=0; j<NUM_ITEM; j++) {

            }
        }

        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 웹 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨터 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }


}
