package com.graphql.jk;

import com.graphql.jk.entities.Book;
import com.graphql.jk.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication  implements CommandLineRunner {

	@Autowired
	private BookServices bookServices;


	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book b1 = new Book();
		b1.setTitle("Complete Java");
		b1.setDesc("Learn Java");
		b1.setPage(2000);
		b1.setPrice(100);
		b1.setAuthor("abc");


		Book b2 = new Book();
		b2.setTitle("Complete Java 2");
		b2.setDesc("Learn Java 2");
		b2.setPage(2000);
		b2.setPrice(100);
		b2.setAuthor("abc");

		this.bookServices.createBook(b1);
		this.bookServices.createBook(b2);

	}
}
