package org.openSourceLibrarySystem.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Service;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class BookEntity {
    @Id
    private String bookID;
    private Double price;
}
