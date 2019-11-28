package io.github.alesur.assetm.restfullwebservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHome() {
        return "home.html";
    }
}
