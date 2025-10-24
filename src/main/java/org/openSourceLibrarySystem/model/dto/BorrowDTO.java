package org.openSourceLibrarySystem.model.dto;

import java.time.LocalDate;

public class BorrowDTO {
    private String borrowId;
    private LocalDate borrowDate,dueDate,returnDate;
    private String status;
}
