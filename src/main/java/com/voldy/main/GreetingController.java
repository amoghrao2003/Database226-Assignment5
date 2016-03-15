package com.voldy.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.voldy.models.Criminal;
import com.voldy.models.CriminalDAO;
import com.voldy.models.TestJoinDAO;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Amogh") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping("/testGet")
    public @ResponseBody String testGet(@RequestParam(value="name", required=false, defaultValue="Amogh") String name, Model model) {
        return "Get method success";
    }
    
    @RequestMapping(value="/getByName")
    @ResponseBody
    public String getByName(String criminal_name,Model m) {
      String criminalId;
      try {
        Criminal user = _criminalDao.getByName(criminal_name);
        criminalId = String.valueOf(user.getCriminal_id());
      }
      catch(Exception ex) {
        return "User not found";
      }
      return "The user id is: " + criminalId;
    }
    
    @RequestMapping(value="/getQuery1")
    @ResponseBody
    public String getQuery1(String age,Model m) {
      String criminalId;
      try {
         _testJoinDao.query1(age);
       
      }
      catch(Exception ex) {
        return "User not found";
      }
      return "Success ";
    }

    @Autowired
    private CriminalDAO _criminalDao;
    
    @Autowired
    private TestJoinDAO _testJoinDao;

    
}
