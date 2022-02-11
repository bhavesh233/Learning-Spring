package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // need a controller method to show initial HTML form

    @RequestMapping("/showForm")
    public String showForm(){
        return  "helloworld-form";
    }

    // need a controller method to process the HTML Form

    @RequestMapping("/processForm")
    public String processForm(){
        return  "helloworld";
    }

    // add a controller method read from data and
    // add data to model

  /*  @RequestMapping("/processFormVersionTwo")
    public String UpperCaseMethod(HttpServletRequest request, Model model){

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert to all CAP
        theName = theName.toUpperCase();

        // create message
        String result = "Yo! "+theName;

        // add message to model
        model.addAttribute("message",result);

        return "helloworld";
    }
    */

    @RequestMapping("/processFormVersionThree")
    public String UpperCaseMethod(@RequestParam("studentName") String theName, Model model){

        // convert to all CAP
        theName = theName.toUpperCase();

        // create message
        String result = "Yo! "+theName;

        // add message to model
        model.addAttribute("message",result);

        return "helloworld";
    }

}
