package com.example.demo.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/user")
  @PreAuthorize("hasRole('ROLE_USER')")
  public String getUser() {
    return "User endpoint accessed successfully!";
  }

  @GetMapping("/admin")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String getAdmin() {
    return "Admin endpoint accessed successfully!";
  }

}