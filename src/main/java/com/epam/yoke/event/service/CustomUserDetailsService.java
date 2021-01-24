package com.epam.yoke.event.service;

import com.epam.yoke.event.entity.UserPrincipal;
import com.epam.yoke.event.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService {
//    implements
// UserDetailsService {

    private final UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

//    @Override
//    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserPrincipal user = userRepository.findByUsername(username);
//        return Optional.ofNullable(user)
//                       .orElseThrow(() -> new UsernameNotFoundException(username));
//    }

}
