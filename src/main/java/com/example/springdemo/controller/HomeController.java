package com.example.springdemo.controller;
import com.example.springdemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/index";
    }
    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model) {
        model.addAttribute("Claus", person);
        return "home/personData";
    }
   /* @PostMapping("/personData")
    public String personData(WebRequest wr, Model model){
        String firstName = wr.getParameter("firstName");
        String lastName = wr.getParameter("lastName");

        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);

        return "home/personData";
    }*/
}
