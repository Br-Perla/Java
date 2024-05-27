package com.example.utente.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "utente")

public class Utente {

    @GetMapping ( path = "/app/{nom1}/{nom2}")
    public @ResponseBody
    String app (@PathVariable String nom1, @PathVariable String nom2) {
        return nom1 + " " + nom2;
    }







}
