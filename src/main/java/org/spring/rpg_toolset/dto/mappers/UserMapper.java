package org.spring.rpg_toolset.dto.mappers;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "user")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    String name;
    @Column(name = "password", nullable = false)
    String password;
    @Column(name = "creation_time", nullable = false)
    LocalDateTime creationTime;
}
