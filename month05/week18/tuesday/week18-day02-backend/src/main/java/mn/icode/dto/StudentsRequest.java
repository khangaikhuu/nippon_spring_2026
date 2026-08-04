package mn.icode.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record StudentsRequest(

		@NotBlank(message = "First name is required") @Size(message = "First name cannot exceed 255 characters", max = 255) String firstName,

		@NotBlank(message = "Last name is required") @Size(message = "Last name cannot exceed 255 characters", max = 255) String lastName,

		@NotBlank(message = "Email is required") @Email(message = "Email address is invalid") @Size(max = 255, message = "Email cannot exceed 150 characters") String email,

		@NotNull(message = "Department is required") Long departmentId

) {

}
