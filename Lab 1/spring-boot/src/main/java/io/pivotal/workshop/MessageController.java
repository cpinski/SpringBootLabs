package io.pivotal.workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

    @GetMapping("/message")
    public ModelAndView message() {
        ModelAndView modelAndView = new ModelAndView("message");
        modelAndView.addObject("message", "This is a Spring Boot app");

        return modelAndView;
    }
}
