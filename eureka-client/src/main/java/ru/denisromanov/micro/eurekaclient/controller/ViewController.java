package ru.denisromanov.micro.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {
    @GetMapping("/view")
    public String some(){
        return "the controller";
    }
}
