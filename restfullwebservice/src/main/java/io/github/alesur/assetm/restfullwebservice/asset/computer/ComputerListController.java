package io.github.alesur.assetm.restfullwebservice.asset.computer;

import io.github.alesur.assetm.restfullwebservice.asset.computer.model.Computer;
import io.github.alesur.assetm.restfullwebservice.asset.computer.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ComputerListController {

    @Autowired
    private ComputerRepository computerRepository;

    @GetMapping(value = "/manage/site/{site}/computers")
    public String computersList(
            @RequestParam(value = "search", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date q,
            Model model) {

        model.addAttribute("computers", computerRepository.findAll());

        return "computer-list.html";

    }
}