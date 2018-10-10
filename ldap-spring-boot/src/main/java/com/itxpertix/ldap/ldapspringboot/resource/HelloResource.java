package com.itxpertix.ldap.ldapspringboot.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping("/check")
    public String checkSecurity(){
        return "Login it's ok";
    }
}
