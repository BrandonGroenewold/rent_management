package com.rent.RenterController;

import com.rent.Dao.ProprietorDao;
import com.rent.Entity.Proprietor;
import com.rent.Dao.RenterDao;
import com.rent.Entity.Renter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RentController {

    @Autowired
    RenterDao renterDao;

    @Autowired
    ProprietorDao proprietorDao;

    @RequestMapping("/insertRenter")
    public String insertRenter(Renter renter){
        renterDao.save(renter);

        return "tenant.html";
    }
    @RequestMapping("/")
    public String greet(){
        return "index.html";
    }

    @RequestMapping("/insertProprietor")
    public String insertProprietor(Proprietor proprietor){
        proprietorDao.save(proprietor);

        return "proprietor.html";

    }

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @GetMapping("/account")
    public String account(){
        return "account.html";
    }

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup.html";
    }

    @GetMapping("/index")
    public String index(){
        return "index.html";
    }

}
