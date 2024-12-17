package com.rajdeep.book_library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class BookModel {
    @Id
    private Long id;
    private String title;
    private String author;
    private Integer year;
}
