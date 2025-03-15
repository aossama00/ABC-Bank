package banking.application.ABC.model.entity;

import banking.application.ABC.enums.AccountStatusE;
import banking.application.ABC.enums.GenderE;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String phoneNo;
    private String email;
    @Enumerated(EnumType.STRING)
    private GenderE gender;
    private String address;
    private BigDecimal accountBalance;
    private String iban;
    @Enumerated(EnumType.STRING)
    private AccountStatusE status;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime modifiedAt;
}
