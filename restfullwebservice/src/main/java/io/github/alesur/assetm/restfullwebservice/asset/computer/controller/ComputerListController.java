package io.github.alesur.assetm.restfullwebservice.asset.computer.controller;

import io.github.alesur.assetm.restfullwebservice.asset.computer.model.ComputerRepository;
import io.github.alesur.assetm.restfullwebservice.asset.computer.model.SiteRepository;
import io.github.alesur.assetm.restfullwebservice.asset.computer.model.data.Computer;
import io.github.alesur.assetm.restfullwebservice.asset.computer.model.data.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Controller
@RequestMapping("/manage/site")
public class ComputerListController {

    @Autowired
    private ComputerRepository computerRepository;

    @Autowired
    private SiteRepository siteRepository;

    @GetMapping("/{siteCode}/computers")
    public String computersListbySite(@PathVariable String siteCode, Model model) {
        Site site = siteRepository.findBySiteCode(siteCode);
        if (site == null) {
            return "redirect:/";
        }

        int siteId = site.getId();
        String siteName = site.getNiceName();

        model.addAttribute("computers", computerRepository.findAllBySiteId(siteId));
        model.addAttribute("siteName", siteName);
        return "computer-list.html";
    }


}