package dev.book.bookorder.model.dto;

import dev.book.bookorder.model.entity.Book;

//DB와 직접적인 관계가 없기 때문에 나중에라도 쓰고싶은 것들은 여기에 넣기
public class OrderDTO {
    private String userName;
    private String address;
    private String bookTitle;
    private String bookAuthor;
    private int totalPrice;
    private Book book;

    public OrderDTO(String userName, String address, String bookTitle, int totalPrice) {
        this.userName=userName;
        this.address=address;
        this.bookTitle=bookTitle;
        this.totalPrice=totalPrice;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "OrderDTO [address=" + address + ", book=" + book + ", bookAuthor=" + bookAuthor + ", bookTitle="
                + bookTitle + ", totalPrice=" + totalPrice + ", userName=" + userName + "]";
    }

    
    
}
