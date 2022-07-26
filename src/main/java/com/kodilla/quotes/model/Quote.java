package com.kodilla.quotes.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "quotes")
public class Quote {

    @Id
    private Long id;
    private String author;
    private String content;
}
