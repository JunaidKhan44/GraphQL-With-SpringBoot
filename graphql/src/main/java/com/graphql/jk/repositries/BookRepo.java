package com.graphql.jk.repositries;

import com.graphql.jk.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Junaid.Khan
 */
public interface BookRepo  extends JpaRepository<Book,Integer> {
}
