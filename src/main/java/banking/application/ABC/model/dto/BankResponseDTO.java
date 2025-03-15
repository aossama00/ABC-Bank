package banking.application.ABC.model.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankResponseDTO {

    private String responseCode;
    private String responseMsg;
    private AccountInfoDTO accountInfo;
}
