
package ru.kata.spring.boot_security.demo.controller;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;


@Controller
public class AdminController {

    private final UserService userService;
    private final RoleService roleService;



    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/admin")
    public String getAllUsers(Model model, @AuthenticationPrincipal User currentUser) {

        model.addAttribute("createUser", new User());
        model.addAttribute("users", userService.getListUsers());
        model.addAttribute("listRoles", roleService.getAllRoles());
        model.addAttribute("currentUser", currentUser);
        return "admin";
    }
    @GetMapping("/admin/edit/{id}")
    public String findUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.findUserById(id));
        return "admin";
    }
    @GetMapping("/user")
    public String getUser(Model model, Principal principal) {
        User user = (User) userService.loadUserByUsername(principal.getName());
        model.addAttribute("user", user);
        return "/user";
    }
}





