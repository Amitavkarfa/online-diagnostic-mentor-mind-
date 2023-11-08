package com.diagonastictest.diagonastic.Controller;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.diagonastictest.diagonastic.Entity.DiagnosticTests;
import com.diagonastictest.diagonastic.Entity.Patients;
import com.diagonastictest.diagonastic.Service.DiagnosticTestsService;
import com.diagonastictest.diagonastic.Service.PatientsService;

@Controller
public class webController {
    @Autowired
    PatientsService ps;
    @Autowired
    DiagnosticTestsService dts;

    

    @GetMapping("/index")
    public String web1(){
        return "index";
    }
    @GetMapping("/login")
    public String web2(){
        return "login";
    }
    @GetMapping("/signup")
    public String web3(Model model){
        model.addAttribute("signupfrom", new Patients());
        return "signup";
    }
    @GetMapping("/about")
    public String web5(){
        return "about";
    }
    @GetMapping("/orders")
    public String web6(){
        return "orders";
    }
    @GetMapping("/admin")
    public String web7(){
        return "admin";
    }
    @GetMapping("/test")
    public String web8(Model model){
        model.addAttribute("test",new DiagnosticTests());

        return "tests";
    }
    @PostMapping("/addt")
    public String web9(DiagnosticTests dtest){
        dts.addTest(dtest);
        
        return "index";

    }

    
    
    @PostMapping("/register")
    public String web4(Patients patients){

    
        ps.addPatients(patients);
        return "login";
    }
    
}


