package io.github.alesur.assetm.restfullwebservice.asset.computer.controller;

import io.github.alesur.assetm.restfullwebservice.asset.computer.repository.ComputerRepository;
import io.github.alesur.assetm.restfullwebservice.site.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ComputerListController {

    @Autowired
    private ComputerRepository computerRepository;

    @GetMapping("/manage/site/{site}/computers")
    public String computersListbySite(Model model){
        model.addAttribute("computers", computerRepository.findAll());

        return "computer-list.html";
    }
}