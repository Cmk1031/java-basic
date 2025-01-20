package day09.bookstore;

import java.util.HashMap;
import java.util.Map;

public class CartItem {
    private Map<String, Integer> itemBook = new HashMap<>();
    private String bookId;
    private int quantity;
    private int totalPrice;

    public CartItem() {

    }

    public Map<String, Integer> getItemBook() {
        return itemBook;
    }

    public void setItemBook(Map<String, Integer> itemBook) {
        this.itemBook = itemBook;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
