package MavenTP3.jas_poo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class NewAddressController {
    @GetMapping("/adresse")
    public String greeting() {
        return "adresse";
    }
}
