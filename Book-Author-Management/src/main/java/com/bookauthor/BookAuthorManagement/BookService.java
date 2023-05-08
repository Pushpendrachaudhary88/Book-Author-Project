package com.bookauthor.BookAuthorManagement;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    BookRepository bookRepository = new BookRepository();
    public String addBook(Book book) {
        return bookRepository.addBook(book);

    }
    public String addAuthor(Author author){
        return bookRepository.addAuthor(author);
    }

    public String getHighestNumberOfPagesBook() {
        return bookRepository.getHighestNumberOfPagesBook();
    }

    public void updatedBookPages(String bookName, int updatedPages) {
        bookRepository.updatedBookPages(bookName,updatedPages);
    }
}
