/*
package ru.kata.spring.boot_security.demo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;
import ru.kata.spring.boot_security.demo.service.UserService;
import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;


@Component
public class TestClass {

    UserService userService;

    PasswordEncoder bCryptPasswordEncoder;

    RoleRepository roleRepository;
    public TestClass(UserService userService, PasswordEncoder bCryptPasswordEncoder, RoleRepository roleRepository) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.roleRepository = roleRepository;
    }



    @PostConstruct
    void init() {
        Role userRole = new Role("ROLE_ADMIN");
        Role adminRole = new Role( "ROLE_USER");

        roleRepository.save(userRole);
        roleRepository.save(adminRole);

        Set<Role> roles = new HashSet<>();

        roles.add(userRole);
        roles.add(adminRole);

        User user = new User("Anton","anton","anton@ru",22,  roles);
        User user1 = new User("Nami","cat","nami@ru",21,  roles);


        userService.addUser(user);
        userService.addUser(user1);


    }
}

 */

