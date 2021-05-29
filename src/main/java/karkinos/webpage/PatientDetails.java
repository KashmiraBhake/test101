package karkinos.webpage;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class PatientDetails {
    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        return modelAndView;
    }

    @RequestMapping("/new_patient")
    public ModelAndView new_patient() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new_patient");

        return modelAndView;
    }

    @RequestMapping(path="/create_new_patient",method=RequestMethod.POST)
    public ModelAndView create_new_patient(
        @RequestParam String fname,
        @RequestParam String lname,
        @RequestParam Integer age,
        @RequestParam String gender,
        @RequestParam String city,
        @RequestParam Integer pin) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("submit");
        modelAndView.addObject("fname", fname);
        modelAndView.addObject("lname", lname);
        modelAndView.addObject("age", age);
        modelAndView.addObject("gender", gender);
        modelAndView.addObject("city", city);
        modelAndView.addObject("pin", pin);


        return modelAndView;
    }

    @RequestMapping("/search_patient_form")
    public ModelAndView search_patient_form() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search_patient_form");

        return modelAndView;
    }

    @RequestMapping(path="/search_patient",method=RequestMethod.POST)
    public ModelAndView search_patient(@RequestParam String name) 
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("search_result");
        modelAndView.addObject("name", name);

        return modelAndView;
    }
}