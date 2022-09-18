package be.snife.mapstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserCommand {
	
	private String firstName;
	private String lastName;
	private String email;

}
