package br.edu.ufrn.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @GetMapping
    public String store() {
        return "Hello World";
    }

    @PostMapping
    public String post() {
        return "Hello World";
    }
}
