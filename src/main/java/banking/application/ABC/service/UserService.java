package banking.application.ABC.service;

import banking.application.ABC.model.dto.BankResponseDTO;
import banking.application.ABC.model.dto.UserRequestDTO;

public interface UserService {
    BankResponseDTO createAccount(UserRequestDTO userRequestDTO);
}
