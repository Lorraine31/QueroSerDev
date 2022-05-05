package br.com.letscode.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorldAnterior() {
        return "Ola mundo";
    }

    @GetMapping(path = "/hello-world2")
    public HelloWorldDTO helloWorld() {

        var helloWorld = new HelloWorldDTO();
        helloWorld.setMensagem("Novo teste");
        helloWorld.setUsername("Lorraine");

        return helloWorld;
    }
}
