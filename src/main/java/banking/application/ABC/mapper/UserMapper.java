package banking.application.ABC.mapper;

import banking.application.ABC.model.dto.UserRequestDTO;
import banking.application.ABC.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserRequestDTO toUserRequestDTO(User user);
    User toUserEntity(UserRequestDTO userRequestDTO);
}
