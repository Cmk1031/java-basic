package day13.homework.Inheritance실습.level02;

public class CheckingAccount extends Account{
    private String cardNo;

    public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    public void pay( String cardNo, long amount) {
        if(this.cardNo.equals(cardNo) && super.getBalance() > amount) {
            long balance = getBalance();
            super.setBalance(balance-amount);
        } else {
            System.out.println("지불이 불가능합니다");
        }
    }
}
