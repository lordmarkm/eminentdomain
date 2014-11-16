package com.eminentdomain.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baldy.commons.web.controller.GenericController;

@Controller
public class RootController extends GenericController {

    @RequestMapping("/")
    public ModelAndView root() {
        return mav("eminentdomain");
    }

}
