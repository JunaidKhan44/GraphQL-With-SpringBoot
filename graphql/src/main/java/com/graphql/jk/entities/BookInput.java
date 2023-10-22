package com.graphql.jk.entities;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Junaid.Khan
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BookInput {


    private String title;
    private String desc;
    private String author;
    private double price;
    private int page;
}
