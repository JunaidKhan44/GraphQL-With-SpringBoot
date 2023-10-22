package com.graphql.jk.entities;


import lombok.*;
import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * @author Junaid.Khan
 */

@Entity
@Table(name= "project_books ")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int page;


}
