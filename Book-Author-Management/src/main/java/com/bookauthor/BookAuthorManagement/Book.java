package com.bookauthor.BookAuthorManagement;

public class Book {
    private int pages;
    private String authorName;
    private String bookName;

    public Book(int pages, String authorName, String bookName) {
        this.pages = pages;
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
