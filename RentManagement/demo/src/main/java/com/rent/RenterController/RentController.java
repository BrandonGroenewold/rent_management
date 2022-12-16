package com.rent.RenterController;

import com.rent.RenterDao.RenterDao;
import com.rent.RenterEntity.Renter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RentController {

    @Autowired
    RenterDao renterDao;

    @RequestMapping("/insertRenter")
    public String insertRenter(Renter renter){
        renterDao.save(renter);

        return "Test.html";
    }
    @RequestMapping("/")
    public String greet(){
        return "index.html";
    }

}
