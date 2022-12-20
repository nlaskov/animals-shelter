package com.example.animalsshelter2.models.views;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;



public class LoginViewModel {

    @NotBlank
    @Size(min = 2, max = 20, message = "Email be between 2 and 20 characters.")
    private String email;

    @NotBlank
    private String password;

    public LoginViewModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}