package org.openSourceLibrarySystem.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class UserEntity {
    @Id
    private String userId;
    private String name,email,phone,address;
    private LocalDate membershipDate;
}