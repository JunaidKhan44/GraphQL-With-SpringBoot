package com.graphql.jk.services;

import com.graphql.jk.entities.Book;

import java.util.List;

/**
 * @author Junaid.Khan
 */

public interface BookServices {

    Book createBook(Book book);

    List<Book> getAllBook();

    Book getId(int id);

}
