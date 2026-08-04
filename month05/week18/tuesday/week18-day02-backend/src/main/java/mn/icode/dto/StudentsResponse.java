package mn.icode.dto;

public record StudentsResponse(

		Long id, String firstName, String lastName, String email, Long departmentId, String departmentName)

{

}
