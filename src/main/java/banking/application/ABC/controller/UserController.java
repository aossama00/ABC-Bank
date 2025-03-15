package banking.application.ABC.controller;

import banking.application.ABC.model.dto.BankResponseDTO;
import banking.application.ABC.model.dto.UserRequestDTO;
import banking.application.ABC.service.impl.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    @Operation(summary = "Create a new user", description = "Adds a new user to the system")
    public BankResponseDTO getUsers(@RequestBody UserRequestDTO userRequest){
        return userService.createAccount(userRequest);
    }
}
