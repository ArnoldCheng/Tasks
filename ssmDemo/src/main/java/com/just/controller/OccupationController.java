package com.just.controller;

import com.just.pojo.Occupation;
import com.just.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OccupationController {

    @Autowired
    private OccupationService occupationService ;

    @RequestMapping("/u/occupation/list")
    public String list(Model model) {
        List<Occupation> occupationList = occupationService.getOccupations() ;
        model.addAttribute("oc", occupationList) ;
        return "occupation" ;
    }
}
