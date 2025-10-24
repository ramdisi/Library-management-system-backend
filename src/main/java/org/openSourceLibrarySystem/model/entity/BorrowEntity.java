package org.openSourceLibrarySystem.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
@Entity
public class BorrowEntity {
    @Id
    private String borrowId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate borrowDate,dueDate,returnDate;
    private String status;
    //@relationship_From_AnotherTable_To_ThisTable+to+relationship_From_ThisTable_To_AnotherTable
    @ManyToOne
    private BookEntity bookEntity;
    @ManyToOne
    private UserEntity userEntity;
}
