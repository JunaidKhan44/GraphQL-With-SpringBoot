package com.graphql.jk.implservices;

import com.graphql.jk.entities.Book;
import com.graphql.jk.repositries.BookRepo;
import com.graphql.jk.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Junaid.Khan
 */

@Service
public class BookService implements BookServices {

    private BookRepo  bookRepo;

    @Autowired
    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book createBook(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book getId(int id) {
        return this.bookRepo.findById(id).orElseThrow( () ->  new RuntimeException("Book not found."));
    }
}
