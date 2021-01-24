package com.epam.yoke.event.repository;

import com.epam.yoke.event.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
