package org.openSourceLibrarySystem.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Entity
@Table(name = "book")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookEntity {
    @Id
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String category;
    private int availableCopies;
}
