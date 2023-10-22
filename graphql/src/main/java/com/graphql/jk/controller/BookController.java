package com.graphql.jk.controller;


import com.graphql.jk.entities.Book;
import com.graphql.jk.entities.BookInput;
import com.graphql.jk.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Junaid.Khan
 */

@Controller
public class BookController {

    @Autowired
    private BookServices  services;

    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput book){
        Book b1 = new Book();
        b1.setTitle(book.getTitle());
        b1.setDesc(book.getDesc());
        b1.setPage(book.getPage());
        b1.setPrice(book.getPrice());
        b1.setAuthor(book.getAuthor());
        return this.services.createBook(b1);
    }

    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.services.getAllBook();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.services.getId(bookId);
    }

}
