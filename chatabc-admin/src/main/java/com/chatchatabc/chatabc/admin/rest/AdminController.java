package com.chatchatabc.chatabc.admin.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/")
    public String index() {
        return "hello";
    }
}
