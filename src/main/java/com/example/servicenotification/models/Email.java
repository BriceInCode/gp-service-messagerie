package com.example.servicenotification.models;

import com.example.servicenotification.enumerations.NotificationStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "email")
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "L'adresse email du destinataire ne peut pas être vide.")
    @Column(nullable = false)
    private String to;

    @NotBlank(message = "Le sujet de l'email ne peut pas être vide.")
    @Column(nullable = false)
    private String subject;

    @NotBlank(message = "Le corps de l'email ne peut pas être vide.")
    @Column(nullable = false)
    private String body;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private NotificationStatus status;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;
}
