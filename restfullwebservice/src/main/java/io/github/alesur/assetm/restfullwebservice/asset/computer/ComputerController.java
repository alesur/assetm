package io.github.alesur.assetm.restfullwebservice.asset.computer;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.github.alesur.assetm.restfullwebservice.asset.computer.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ComputerController {

    @Autowired
    private ComputerRepository dogrepository;

    @Autowired
    private ComputerService dogservice;

    private ArrayList dogModelList;

    private List dogrisklist = null;

//    @GetMapping(value = "/manage/site/{site}/computers")
//    public String doghome(
//            @RequestParam(value = "search", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date q,
//            Model model) {
//        if (q != null) {
//            dogModelList = new ArrayList();
//            System.out.println("q is = " + q);
//            dogrisklist = dogservice.atriskdogs(q);
//            for (Object name : dogrisklist) {
//                System.out.println("Dogs in repository are : " + dogrepository.findAll());
//                Computer doggy = dogrepository.findByName(name);
//                System.out.println(doggy.toString() + "doggy name : " + doggy.getName());
//                dogModelList.add(doggy);
//                System.out.println("This dog's name is : " + doggy.getName());
//            }
//        }
//        model.addAttribute("search", dogModelList);
//
//        model.addAttribute("dogs", dogrepository.findAll());
//
//        return "computer-list.html";
//
//    }

//    @PostMapping(value = "/")
//    public String adddog(@RequestParam("name") String name,
//                         @RequestParam("rescued") @DateTimeFormat(pattern = "yyyy-MM-dd") Date rescued,
//                         @RequestParam("vaccinated") Boolean vaccinated, Model model) {
//        dogservice.addADog(name, rescued, vaccinated);
//        System.out.println("name = " + name + ",rescued = " + rescued + ", vaccinated = " + vaccinated);
//        return "redirect:/";
//    }

//    @PostMapping(value = "/delete")
//    public String deleteDog(@RequestParam("name") String name,
//                            @RequestParam("id") Long id) {
//        dogservice.deleteADOG(name, id);
//        System.out.println("Dog named = " + name + "was removed from our database. Hopefully he or she was adopted.");
//        return "redirect:/";
//
//    }

//    @PostMapping(value = "/genkey")
//    public String genkey(@RequestParam("name") String name,
//                         @RequestParam("rescued") @DateTimeFormat(pattern = "yyyy-MM-dd") Date rescued,
//                         @RequestParam("vaccinated") Boolean vaccinated, Model model) {
//        dogservice.getGeneratedKey(name, rescued, vaccinated);
//        System.out.println("name = " + name + ",rescued = " + rescued + ", vaccinated = " + vaccinated);
//        return "redirect:/";
//    }

}
