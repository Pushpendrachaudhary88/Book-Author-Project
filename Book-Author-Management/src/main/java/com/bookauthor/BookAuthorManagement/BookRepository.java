package com.bookauthor.BookAuthorManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {
    private HashMap<String,Book> book_db;
    private HashMap<String,Author> author_db;

    public BookRepository(){
        this.book_db = new HashMap<>();
        this.author_db = new HashMap<>();
    }


    public String addBook(Book book) {
        if(book_db.containsKey(book.getBookName())){
            return "Book already Present";
        }
        book_db.put(book.getBookName(),book);
            return "Book Added Successfully";

    }

    public String addAuthor(Author author){
        if(author_db.containsKey(author.getName())){
            return "Author already present";
        }
        author_db.put(author.getName(),author);
        return "Author Added Successfully";
    }

    public String getHighestNumberOfPagesBook() {
        String bookName="";
        int maxPages =0;
        for(Book book : book_db.values()){
            if(book.getPages()>maxPages){
                maxPages = book.getPages();
                bookName= book.getBookName();
            }
        }
        return bookName;
    }

    public void updatedBookPages(String bookName, int updatedPages) {
        int oldPages = book_db.get(bookName).getPages();
        book_db.get(bookName).setPages(oldPages+updatedPages);
    }
}

