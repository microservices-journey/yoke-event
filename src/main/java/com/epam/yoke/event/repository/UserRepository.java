package com.epam.yoke.event.repository;

import com.epam.yoke.event.entity.UserPrincipal;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserPrincipal, Long> {

    UserPrincipal findByUsername(String username);

}
