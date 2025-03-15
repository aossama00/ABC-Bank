package banking.application.ABC.service.impl;

import banking.application.ABC.mapper.UserMapper;
import banking.application.ABC.model.dto.AccountInfoDTO;
import banking.application.ABC.model.dto.BankResponseDTO;
import banking.application.ABC.model.dto.UserRequestDTO;
import banking.application.ABC.model.entity.User;
import banking.application.ABC.repository.UserRepository;
import banking.application.ABC.service.UserService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static banking.application.ABC.utils.AccountUtils.*;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public BankResponseDTO createAccount(UserRequestDTO userRequestDTO) {

        if(userRepository.existsByEmail(userRequestDTO.getEmail()))
            return new BankResponseDTO(
                    ACCOUNT_EXISTS_CODE,
                    ACCOUNT_EXISTS_MESSAGE,
                    null);

        // Saving a new user into DB -- Creating an account
        User user = userMapper.toUserEntity(userRequestDTO);
        user.setAccountBalance(BigDecimal.ZERO);
        user.setIban(generateIban());
        userRepository.save(user);

        return BankResponseDTO.builder()
                .responseMsg(ACCOUNT_CREATION_MESSAGE)
                .responseCode(ACCOUNT_SUCCESS_CODE)
                .accountInfo(AccountInfoDTO.builder()
                                 .iban(user.getIban())
                                 .accountName(user.getFullName())
                                 .accountBalance(user.getAccountBalance())
                                 .build())
                .build();
    }
}
