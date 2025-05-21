package exercise.dto;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter
public class ProductUpdateDTO {
    private long id;
    private String title;
    private int price;
    private LocalDate updatedAt;
    private LocalDate createdAt;
}
