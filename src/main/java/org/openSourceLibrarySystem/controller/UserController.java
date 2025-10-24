package org.openSourceLibrarySystem.controller;

import org.openSourceLibrarySystem.model.dto.UserDTO;
import org.openSourceLibrarySystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/save")
    public void save(@RequestBody UserDTO user){
        userService.save(user);
    }
    @GetMapping("get/{id}")
    public UserDTO getDetails(@PathVariable String id){
        return userService.getDetails(id);
    }
}
