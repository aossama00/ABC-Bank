package banking.application.ABC.model.dto;

import banking.application.ABC.enums.AccountStatusE;
import banking.application.ABC.enums.GenderE;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequestDTO {

    private String fullName;
    private String email;
    private String phoneNo;
    private String address;
    private String firstName;
    private String lastName;
    private GenderE gender;
    private AccountStatusE status;
}
