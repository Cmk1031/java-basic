package day13.homework.class실습;

public class BookMgr {

    //책 목록 배열 멤버 변수
    private Book[] booklist;

    //booklist 초기화 생성자 메서드
    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    //booklist 화면에 출력
    public void printBooklist(){

        for (Book book : booklist) {
            System.out.println(book.getTitle());
        }
    }
    //모든 책 가격의 합 출력
    public void printTotalPrice(){
        int totalPrice = 0;
        for (Book book : booklist) {
            totalPrice+=book.getPrice();
        }
        System.out.println("전체 책 가격의 합 : "+ totalPrice);
    }
}
