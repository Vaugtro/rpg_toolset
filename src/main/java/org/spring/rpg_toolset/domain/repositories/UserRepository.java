package org.spring.rpg_toolset.domain.repositories;

import org.spring.rpg_toolset.dto.mappers.UserMapper;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserMapper, Long> {
}
