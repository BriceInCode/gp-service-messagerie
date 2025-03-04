package com.example.servicenotification.models;

import com.example.servicenotification.enumerations.NotificationStatus;
import com.example.servicenotification.validations.ValidPhoneNumber;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sms")
@NoArgsConstructor
@AllArgsConstructor
public class SMS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Le numéro du destinataire ne peut pas être vide.")
    @ValidPhoneNumber(message = "Le numéro de téléphone du destinataire doit être un numéro camerounais valide.")
    @Column(nullable = false)
    private String to;

    @NotBlank(message = "Le message ne peut pas être vide.")
    @Column(nullable = false)
    private String message;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private NotificationStatus status;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;
}
