package com.epam.yoke.event.entity;

import lombok.Data;
//import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Role {
//        implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
//    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
//    private Collection<UserPrincipal> users;

//    @Override
//    public String getAuthority() {
//        return getName();
//    }
}
