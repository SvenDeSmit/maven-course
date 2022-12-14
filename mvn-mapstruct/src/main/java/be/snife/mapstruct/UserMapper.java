package be.snife.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	UserCommand updateUserToCommand(User user);
	
	User updateCammandToUser(UserCommand userCommand);

	
}
