package io.github.alesur.assetm.restfullwebservice.asset.computer.controller;

import io.github.alesur.assetm.restfullwebservice.asset.computer.model.ComputerRepository;
import io.github.alesur.assetm.restfullwebservice.asset.computer.model.SiteRepository;
import io.github.alesur.assetm.restfullwebservice.asset.computer.model.data.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manage/site")
public class DasboardController {

    @Autowired
    private ComputerRepository computerRepository;

    @Autowired
    private SiteRepository siteRepository;

    @GetMapping("/{siteCode}/dashboard")
    public String dashboardView(@PathVariable String siteCode, Model model) {
        Site site = siteRepository.findBySiteCode(siteCode);
        if (site == null) {
            return "redirect:/";
        }

        int siteId = site.getId();
        String siteName = site.getNiceName();

        model.addAttribute("computers", computerRepository.findAllBySiteId(siteId));
        model.addAttribute("siteName", siteName);
        model.addAttribute("siteCode", siteCode);
        model.addAttribute("site", siteRepository.findAll());
        return "home.html";
    }
}
