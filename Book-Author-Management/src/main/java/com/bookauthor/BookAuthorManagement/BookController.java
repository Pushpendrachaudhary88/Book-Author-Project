package com.bookauthor.BookAuthorManagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    BookService bookService = new BookService();

    @PostMapping("/add-book")
    public ResponseEntity addBook(@RequestBody Book book){
        String message = bookService.addBook(book);
        return new ResponseEntity(message, HttpStatus.CREATED);
    }
    @PostMapping("/add-author")
    public ResponseEntity addAuthor(@RequestBody Author author){
        String message = bookService.addAuthor(author);
        return new ResponseEntity(message,HttpStatus.CREATED);
    }

    @GetMapping("/get-highest-number-of-pages-book")
    public ResponseEntity getHighestNumberOfPagesBook(){
        String message = bookService.getHighestNumberOfPagesBook();
        return new ResponseEntity(message,HttpStatus.CREATED);
    }

    @PutMapping("/update-book-pages")
    public ResponseEntity updateBookPages(@RequestParam("bookName") String bookName, @RequestParam("updatedPages") int updatedPages){
        bookService.updatedBookPages(bookName,updatedPages);
        return new ResponseEntity("Pages updated Successfully", HttpStatus.CREATED);
    }

}
