package com.evoluum.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    // @RequestMapping("/user")
    // public Principal getCurrentLoggedInUser(Principal user) {
    // return user;
    // }

    @RequestMapping("/user")
    public String getCurrentLoggedInUser() {
        return "Hellooooooooooo";
    }
}
