package exercise.dto;

import java.util.List;

//import exercise.model.Comment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDTO {
    private Long id;
    private String body;
    private String title;
    private List<CommentDTO> comments;
}
