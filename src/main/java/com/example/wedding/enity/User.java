package com.example.wedding.enity;

import com.example.wedding.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    @SequenceGenerator(sequenceName = "user_seq", name = "user_gen", allocationSize = 1, initialValue = 11)
    Long id;
    String fullName;
    String relatives;
    boolean isCome;
    int guestCount; @Enumerated(EnumType.STRING)
    Role role;
}
