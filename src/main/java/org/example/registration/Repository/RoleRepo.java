package org.example.registration.Repository;

import org.example.registration.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
