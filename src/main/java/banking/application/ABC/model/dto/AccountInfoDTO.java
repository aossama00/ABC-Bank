package banking.application.ABC.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AccountInfoDTO {

    private String accountName;
    private String iban;
    private BigDecimal accountBalance;
}
