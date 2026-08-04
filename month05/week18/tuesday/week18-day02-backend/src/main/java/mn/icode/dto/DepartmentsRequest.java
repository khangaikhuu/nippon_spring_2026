package mn.icode.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DepartmentsRequest(
		@NotBlank(message = "Department name is required") 
		@Size(max = 100, message = "Department name cannot exceed 100 characters")
		String departmentName) 
{}
