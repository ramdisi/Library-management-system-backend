package org.openSourceLibrarySystem.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class UserDTO {
    private String userId,name,email,phone,address;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate membershipDate;
}
