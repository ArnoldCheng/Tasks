package com.just.controller;

import com.just.pojo.Trainee;
import com.just.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TraineeController {

    @Autowired
    private TraineeService traineeService ;

    @RequestMapping("/index")
    public String index(Model model) {
        List<Trainee> trainees = traineeService.getTraineeList() ;

        model.addAttribute("trainees",trainees) ;
        return "index" ;
    }

    @RequestMapping("/trainee/list")
    public String getTraineeList(Model model) {
        List<Trainee> trainees = traineeService.getTraineeList() ;
        for (Trainee trainee : trainees) {
            System.out.println(trainee);
        }
        model.addAttribute("trainees",trainees) ;
        return "traineeList" ;
    }

    @RequestMapping("/trainee/add")
    public String add() {
        return "traineeAdd" ;
    }

    @RequestMapping(value = "/trainee", method = RequestMethod.POST)
    public String save(Trainee trainee) {
        traineeService.createTrainee(trainee) ;
        return "redirect:/trainee/list" ;
    }

    @RequestMapping(value = "/trainee", method = RequestMethod.PUT)
    public String update(Trainee trainee) {
        traineeService.updateTrainee(trainee) ;
        return "redirect:/trainee/list" ;
    }

    @RequestMapping(value = "/trainee/{id}")
    public String edit(Model model, @PathVariable long id) {
        Trainee trainee = traineeService.findById(id) ;
        model.addAttribute("trainee", trainee) ;
        return "traineeEdit" ;
    }

    @RequestMapping(value = "/trainee/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable long id) {
        traineeService.deleteTrainee(id) ;
        return "redirect:/trainee/list" ;
    }
}
