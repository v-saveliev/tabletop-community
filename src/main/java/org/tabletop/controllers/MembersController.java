package org.tabletop.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MembersController {
    @GetMapping("/ping")
    @ResponseStatus(HttpStatus.OK)
    public static void ping() {

    }

}
