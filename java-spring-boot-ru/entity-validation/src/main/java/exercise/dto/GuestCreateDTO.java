package exercise.dto;

// BEGIN

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class GuestCreateDTO {
    @NotBlank
    private String name;
    @Email
    private String email;
    @Pattern(regexp = "\\d {4}")
    private String clubCard;

    @Pattern(regexp = "^\\+\\d{11,13}$")
    private String phoneNumber;

    @FutureOrPresent
    private LocalDate cardValidUntil;
}
// END
