package examsApp.payload.exam;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import examsApp.model.Question;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExamViewPayload {
    
    @NotBlank
    private long id;

    @NotBlank
    @Schema(description = "Exam name", example = "Driving Basics", requiredMode = RequiredMode.REQUIRED)
    private String name;

    @NotBlank
    @Schema(description = "Description of the exam", example = "Parts of the vehicle", requiredMode = RequiredMode.REQUIRED)
    private String description;

    // Questions of the exam
    @Schema(description = "Questions of the exam", requiredMode = RequiredMode.NOT_REQUIRED)
    private List<Question> exam_questions;
}
