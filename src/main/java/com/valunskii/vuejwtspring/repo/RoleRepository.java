package com.valunskii.vuejwtspring.repo;

import com.valunskii.vuejwtspring.entity.ERole;
import com.valunskii.vuejwtspring.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
